package com.zqs.web.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zqs.service.sys.ISysUrlService;

@Controller
@RequestMapping(value="/base")
public class CommonController {
	
	@Autowired
	private ISysUrlService sysUrlService;
	
	@RequestMapping(value="/bindData")
	@ResponseBody
	public String bindData(int pageNum,int pageSize){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("offset", pageNum);
		params.put("rows", pageSize);
		return sysUrlService.page(params);
	}
}
