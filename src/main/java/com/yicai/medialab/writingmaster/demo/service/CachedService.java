package com.yicai.medialab.writingmaster.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yicai.medialab.writingmaster.demo.dao.CachedDao;
import com.yicai.medialab.writingmaster.demo.entity.SysUser;

@Service
public class CachedService {
	@Autowired
	private CachedDao cachedDao;

	public SysUser getSysUserById(String id) {
		return cachedDao.getSysUserById(id);
	}
}
