package com.zqs.service.sys;

import com.zqs.model.sys.member.SysMember;

public interface ISysMemberService {
	
	/**
	 * @Description: 根据登录名查询
	 *
	 * @return: SysMember
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日下午5:45:09
	 */
	SysMember loadByLoginName(String loginName);
}
