package com.zqs.model.sys.member;
/**
 * @Description: 后台用户
 * 
 * @author: qiushi.zhou
 * @since: 2016年6月23日下午1:44:08
 */
public class SysMember {

	/** id*/
	private Long id;
	/** 登录名*/
	private String loginName;
	/** 密码*/
	private String password;
	/** 手机号*/
	private String mobile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
