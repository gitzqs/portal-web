package com.zqs.model.domain;
/**
 * 域名映射
 *
 * @author: qiushi.zhou
 * @since: 2016年7月5日上午9:52:41
 */
public class DomainUrl {
	
	private Long id;
	/** 域名*/
	private String name;
	/** 对应用户*/
	private Long customerId;
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
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
}
