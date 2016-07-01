package com.zqs.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="sys")
public class SysController {
	
	
	
	@RequestMapping(value="/url",method=RequestMethod.GET)
	public String setUrl(){
		return "/admin/sys/sysUrl";
	}
}
