package com.zqs.service.domain.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqs.dao.domain.IDomainUrlMapper;
import com.zqs.model.domain.DomainUrl;
import com.zqs.service.domain.IDomainUrlService;
@Service("domainUrlService")
public class DefaultDomainUrlServiceImpl implements IDomainUrlService {
	
	@Autowired
	private IDomainUrlMapper domainUrlMapper;

	@Override
	public DomainUrl loadByName(String name) {
		return domainUrlMapper.loadByLoginName(name);
	}

}
