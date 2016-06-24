package com.zqs.service.sys.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zqs.dao.sys.member.ISysMemberMapper;
import com.zqs.dao.sys.url.ISysUrlMapper;
import com.zqs.model.sys.member.SysMember;
import com.zqs.model.sys.url.SysUrl;
import com.zqs.service.sys.ISysMemberService;
@Service("sysMemberSercice")
public class DefaultSysMemberServiceImpl implements ISysMemberService {
	
	@Autowired
	private ISysMemberMapper sysMemberMapper;
	@Autowired
	private ISysUrlMapper sysUrlMapper;
	
	@Override
	public SysMember loadByLoginName(String loginName) {
		
		return sysMemberMapper.loadByLoginName(loginName);
	}

	@Override
	public List<SysUrl> loadByLevel(int level) {
		return sysUrlMapper.loadByLevel(level);
	}

	@Override
	public List<SysUrl> loadByHighId(Long highId) {
		return sysUrlMapper.loadByHighId(highId);
	}

}
