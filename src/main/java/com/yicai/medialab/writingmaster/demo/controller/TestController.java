package com.yicai.medialab.writingmaster.demo.controller;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.AbstractHandlerMethodMapping;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private AbstractHandlerMethodMapping<?> handlerMethodMapping;

	@PostConstruct
	public void init() {
		System.out.println(handlerMethodMapping);
		System.out.println(handlerMethodMapping.getClass());
		Map<?, HandlerMethod> handlerMethods = handlerMethodMapping.getHandlerMethods();
		// Set<Entry<?, HandlerMethod>> entrySet = handlerMethods.entrySet();
		Set<?> entrySet = handlerMethods.entrySet();
		for (Object entryObj : entrySet) {
			Entry<RequestMappingInfo, HandlerMethod> entry = (Entry<RequestMappingInfo, HandlerMethod>) entryObj;
			System.out.println(entry.getKey());
			System.out.println(entry.getKey().getClass());
			System.out.println(entry.getValue());
		}
	}

	@RequestMapping({ "/test1", "/test3" })
	@ResponseBody
	public Map<String, Object> test1() {
		return Collections.singletonMap("key1", new Date());
	}

	@RequestMapping("/test2")
	@ResponseBody
	public Map<String, Object> test2() {
		return Collections.singletonMap("key2", new Date());
	}
}
