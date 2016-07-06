package com.zqs.dao.Source;

import com.zqs.model.source.DataSource;

public interface IDataSourceMapper {
	
	/**
	 * 根据memberId查询
	 * 
	 * @return: DataSource
	 * @author: qiushi.zhou
	 * @since: 2016年7月6日下午5:04:39
	 */
	DataSource loadBySysMemberId(Long memberId);
	
	/**
	 * 根据名称查询
	 * 
	 * @return: DataSource
	 * @author: qiushi.zhou
	 * @since: 2016年7月6日下午5:28:12
	 */
	DataSource loadByName(String name);
}
