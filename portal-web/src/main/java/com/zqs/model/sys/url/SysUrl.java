package com.zqs.model.sys.url;
/**
 * 
 *
 * @author: qiushi.zhou
 * @since: 2016年6月24日上午10:55:33
 */
public class SysUrl {
	
	/** id*/
	private Long id;
	/** 名称*/
	private String name;
	/** 路径*/
	private String url;
	/** 级别{@link ELevel.java}*/
	private int level;
	/** 上级id*/
	private Long highId;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Long getHighId() {
		return highId;
	}
	public void setHighId(Long highId) {
		this.highId = highId;
	}
	
	
}
