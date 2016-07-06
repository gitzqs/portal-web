package com.zqs.service.source.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqs.dao.Source.IDataSourceMapper;
import com.zqs.model.source.DataSource;
import com.zqs.service.source.IDataSourceService;
@Service("dataSourceService")
public class DefultDataSourceServiceImpl implements IDataSourceService {
	
	@Autowired
	private IDataSourceMapper dataSourceMapper;
	
	@Override
	public DataSource loadByMemberId(Long memberId) {
		return dataSourceMapper.loadBySysMemberId(memberId);
	}

	@Override
	public DataSource loadByName(String name) {
		return dataSourceMapper.loadByName(name);
	}

}
