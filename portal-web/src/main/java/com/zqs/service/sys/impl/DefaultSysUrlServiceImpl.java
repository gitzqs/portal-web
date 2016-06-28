package com.zqs.service.sys.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.json.JSONUtils;
import com.zqs.dao.sys.url.ISysUrlMapper;
import com.zqs.service.sys.ISysUrlService;
@Service("sysUrlService")
public class DefaultSysUrlServiceImpl implements ISysUrlService {
	
	@Autowired
	private ISysUrlMapper sysUrlMapper;
	
	@Override
	public String page(Map<String,Object> params) {
		List<Map<String,Object>> rows = sysUrlMapper.page(params);
		Long total = sysUrlMapper.total(params);
		params.clear();
		params.put("rows", rows);
		params.put("total", total);
		return JSONUtils.toJSONString(params);
	}

}
