package com.zqs.web.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import com.zqs.model.sys.url.SysUrl;
import com.zqs.model.sys.url.e.ELevel;
import com.zqs.service.admin.IAdminService;
import com.zqs.service.sys.ISysMemberService;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	@Autowired
	private ISysMemberService sysMemberService;
	
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
	public String index(HttpSession session,Model model){
		if(session.getAttribute("loginName") == null){
			return "redirect:/admin/login";
		}
		//1、登录名
		String loginName = session.getAttribute("loginName").toString();
		model.addAttribute("username", loginName);
		
		//2、菜单
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		
		List<SysUrl> urlList = sysMemberService.loadByLevel(ELevel.FIRST_LEVEL);
		if(urlList !=null && urlList.size() >0){
			for(int i=0; i< urlList.size(); i++){
				Map<String,Object> params = new HashMap<String,Object>();
				params.put("id", urlList.get(i).getId());
				params.put("name", urlList.get(i).getName());
				List<SysUrl> sList = sysMemberService.loadByHighId(urlList.get(i).getId());
				if(sList !=null && sList.size() >0){
					params.put("sList", sList);
				}
				mapList.add(params);
			}
			model.addAttribute("urlList", mapList);
		}
		return "admin/admin";
	}
	/**
	 * 退出
	 * 
	 * @return: String
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午3:33:53
	 */
	@RequestMapping(value="/loginOut")
	public String loginOut(HttpSession session){
		session.removeAttribute("loginName");
		return "redirect:/admin/login";
	}
	
}
