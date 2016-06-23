package com.zqs.service.admin;

import java.util.Map;

import javax.servlet.http.HttpSession;

public interface IAdminService {
	
	Map<String,Object> handleLogin(String username,String password,HttpSession session);
}
