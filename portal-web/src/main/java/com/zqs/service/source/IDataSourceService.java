package com.zqs.service.source;

import com.zqs.model.source.DataSource;

public interface IDataSourceService {
	
	DataSource loadByMemberId(Long memberId);
	
	DataSource loadByName(String name);
}
