package com.zqs.service.sys;

import java.util.List;

import com.zqs.model.sys.member.SysMember;
import com.zqs.model.sys.url.SysUrl;

public interface ISysMemberService {
	
	/**
	 * @Description: 根据登录名查询
	 *
	 * @return: SysMember
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日下午5:45:09
	 */
	SysMember loadByLoginName(String loginName);
	/**
	 * 根据级别查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午2:26:40
	 */
	List<SysUrl> loadByLevel(int level);
	/**
	 * 根据highId查询
	 * 
	 * @return: List<SysUrl>
	 * @author: qiushi.zhou
	 * @since: 2016年6月24日下午3:03:17
	 */
	List<SysUrl> loadByHighId(Long highId);
}
