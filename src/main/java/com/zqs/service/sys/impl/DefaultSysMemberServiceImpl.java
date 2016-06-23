package com.zqs.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqs.dao.sys.member.ISysMemberMapper;
import com.zqs.model.sys.member.SysMember;
import com.zqs.service.sys.ISysMemberService;
@Service("sysMemberSercice")
public class DefaultSysMemberServiceImpl implements ISysMemberService {
	
	@Autowired
	private ISysMemberMapper sysMemberMapper;
	
	@Override
	public SysMember loadByLoginName(String loginName) {
		
		return sysMemberMapper.loadByLoginName(loginName);
	}

}
