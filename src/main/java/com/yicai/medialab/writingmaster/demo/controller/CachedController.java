package com.yicai.medialab.writingmaster.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yicai.medialab.writingmaster.demo.entity.SysUser;
import com.yicai.medialab.writingmaster.demo.service.CachedService;

@Controller
@RequestMapping("/cache")
public class CachedController {
	@Autowired
	private CachedService cachedService;

	@RequestMapping("/sysuser")
	@ResponseBody
	public SysUser getSysUserById(String id) {
		return cachedService.getSysUserById(id);
	}
}
