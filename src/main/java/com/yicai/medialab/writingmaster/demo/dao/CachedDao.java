package com.yicai.medialab.writingmaster.demo.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.yicai.medialab.writingmaster.demo.entity.SysUser;

@Repository
public class CachedDao {

	@Cacheable(value = "sysUser", key = "#id")
	public SysUser getSysUserById(String id) {
		System.out.println("模拟从数据库取数据...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("返回数据库数据...");
		return new SysUser(id, "chenyiliang", "8888", null, null, null, null, null, null, null, null, null, null, null,
				null);
	}
}
