package com.zqs.web.admin;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.zqs.service.admin.IAdminService;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	
	/**
	 * @Description: 后台登录页面
	 *
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日上午11:30:46
	 */
	@RequestMapping(value="/login")
	public String login(){
		
		return "admin_login/login";
	}
	
	/**
	 * @Description: 后台登录处理
	 *
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日下午2:20:46
	 */
	@RequestMapping(value="/handleLogin")
	public String handleLogin(RedirectAttributesModelMap modelMap,HttpSession session,String username,String password){
		Map<String,Object> params = adminService.handleLogin(username, password,session);
		if(params !=null){
			if(params.get("status").equals("0000")){
				return "redirect:/admin/index";
			}else{
				modelMap.addFlashAttribute("error", params.get("message"));
				return "redirect:/admin/login";
			}
		}
		return "";
	}
	
	/**
	 * @Description: 后台管理主页
	 *
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日下午2:21:44
	 */
	@RequestMapping(value="/index")
	public String index(HttpSession session){
		return "admin/admin";
	}
}
