package com.zqs.dao.domain;

import com.zqs.model.domain.DomainUrl;

public interface IDomainUrlMapper {
	
	/**
	 * 根据域名查询
	 * 
	 * @return: DomainUrl
	 * @author: qiushi.zhou
	 * @since: 2016年7月5日上午10:06:17
	 */
	DomainUrl loadByLoginName(String name);
}
