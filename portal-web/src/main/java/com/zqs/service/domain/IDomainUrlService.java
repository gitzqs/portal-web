package com.zqs.service.domain;

import com.zqs.model.domain.DomainUrl;

public interface IDomainUrlService {
	
	/**
	 * 根据域名获取信息
	 * 
	 * @return: DomainUrl
	 * @author: qiushi.zhou
	 * @since: 2016年7月5日上午10:10:33
	 */
	DomainUrl loadByName(String name);
}
