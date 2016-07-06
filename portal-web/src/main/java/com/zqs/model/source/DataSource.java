package com.zqs.model.source;
/**
 * 数据源
 *
 * @author: qiushi.zhou
 * @since: 2016年7月6日下午4:51:47
 */
public class DataSource {
	
	private Long id;
	/** 数据源名称*/
	private String name;
	/** 驱动名称*/
	private String driverClass;
	/** 链接地址*/
	private String url;
	/** 用户名*/
	private String userName;
	/** 密码*/
	private String userPassword;
	/** 客户id*/
	private Long sysMemberId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Long getSysMemberId() {
		return sysMemberId;
	}
	public void setSysMemberId(Long sysMemberId) {
		this.sysMemberId = sysMemberId;
	}
	
	
}
