package com.zqs.web.homeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/home")
public class HomeSetController {
	
	
	@RequestMapping(value="/sys")
	public String sys(){
		return "admin/sys/system";
	}
	/**
	 * 个人简介页面
	 * 
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午3:36:59
	 */
	@RequestMapping(value="/personal_profile")
	public String personSet(){
		return "admin/center/personal_profile";
	}
	/**
	 * 工作经历页面
	 * 
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午4:50:33
	 */
	@RequestMapping(value="/work_experience")
	public String work(){
		return "admin/center/work_experience";
	}
	/**
	 * 项目案例页面
	 * 
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午4:52:41
	 */
	@RequestMapping(value="/project_ex")
	public String project(){
		return "admin/center/project_ex";
	}
	/**
	 * 未完待续
	 * 
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午4:55:29
	 */
	@RequestMapping(value="/to_be_continue")
	public String toContinue(){
		return "admin/center/to_be_continue";
	}
}
