package com.zqs.service.admin.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.zqs.dao.sys.member.ISysMemberMapper;
import com.zqs.model.sys.member.SysMember;
import com.zqs.service.admin.IAdminService;
@Service("adminService")
public class DefaultAdminServiceImpl implements IAdminService {
	
	@Autowired
	private ISysMemberMapper sysMemberMapper;
	
	@Override
	public Map<String, Object> handleLogin(String username, String password,HttpSession session) {
		Map<String,Object> returnParams = new HashMap<String,Object>();
		String status = "0001";
		String message = "登录失败";
		//1、验证参数是否为空
		if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
			//2、验证登录名是否存在
			SysMember sysMember = sysMemberMapper.loadByLoginName(username);
			if(sysMember != null){
				//3、验证密码是否正确
				if(sysMember.getPassword().equals(DigestUtils.md5Hex(password))){
					//将用户名存入session中
					session.setAttribute("loginName", sysMember.getLoginName());
					status = "0000";
					message = "处理成功";
				}else{
					message = "密码不正确，请重新输入！";
				}
			}else{
				message = "该用户不存在！";
			}
		}else{
			message = "参数不能为空！";
		}
		returnParams.put("status", status);
		returnParams.put("message", message);
		return returnParams;
	}

}
