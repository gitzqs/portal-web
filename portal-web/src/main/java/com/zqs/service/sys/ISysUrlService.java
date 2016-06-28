package com.zqs.service.sys;

import java.util.Map;

public interface ISysUrlService {
	
	/**
	 * 分页查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月28日上午10:16:27
	 */
	String page(Map<String,Object> params);
}
