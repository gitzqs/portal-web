package com.zqs.dao.sys.member;

import org.springframework.stereotype.Repository;

import com.zqs.model.sys.member.SysMember;
@Repository
public interface ISysMemberMapper {
	
	/**
	 * @Description: 根据登录名查询
	 *
	 * @return: SysMember
	 * @author: qiushi.zhou
	 * @since: 2016年6月23日下午2:00:06
	 */
	SysMember loadByLoginName(String loginName);
}
