package com.zqs.aop.dataSource;

import java.util.Map;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.util.StringUtils;

import com.zqs.model.source.DataSource;
import com.zqs.service.source.IDataSourceService;
import com.zqs.util.ApplicationContextHolder;

public class DynamicDataSource extends AbstractRoutingDataSource{
	
	private static String DEFAULT_DATA_SOURCE = "data_source_mapping";
	private Map<String,Object> _targetDataSources;
	IDataSourceService dataSourceService = (IDataSourceService) ApplicationContextHolder.getBean("dataSourceService");
	@Override
	protected Object determineCurrentLookupKey() {
		String dataSourceName = DBContextHolder.getDbType();
		if(StringUtils.isEmpty(dataSourceName)){
			dataSourceName = DEFAULT_DATA_SOURCE;
		}else{
			//1、判断数据源是否存在于数据库
			if(this.isExists(dataSourceName)){
				//2、数据源新增或者链接
				this.handleDataSource(dataSourceName);
			}else{
				dataSourceName = DEFAULT_DATA_SOURCE;
			}
		}
		return dataSourceName;
	}
	
	private boolean isExists(String dataSourceName){
		boolean result = false;
		//切换到默认数据源
		DBContextHolder.setDbType(DEFAULT_DATA_SOURCE);
		this.determineCurrentLookupKey();
		DataSource dataSource = dataSourceService.loadByName(dataSourceName);
		if(dataSource != null){
			result = true;
		}
		return result;
	}
	
	private void handleDataSource(String dataSourceName){
		//1、判断数据源是否存在
	}
	
	
}
