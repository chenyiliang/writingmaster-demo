package com.yicai.medialab.writingmaster.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yicai.medialab.writingmaster.demo.entity.SysUser;
import com.yicai.medialab.writingmaster.demo.validator.SysUserValidator;

@Controller
@RequestMapping("/sysuser")
public class SysUserController {

	@RequestMapping("/validate/page")
	public String validatePage1(Model model) {
		model.addAttribute("sysUser", new SysUser());
		return "validate1";
	}

	@RequestMapping("/validate/action")
	public String validateAction1(@ModelAttribute SysUser sysUser, BindingResult bindingResult, Model model) {
		SysUserValidator validator = new SysUserValidator();
		validator.validate(sysUser, bindingResult);
		if (bindingResult.hasErrors()) {
			List<ObjectError> errors = bindingResult.getAllErrors();
			for (ObjectError error : errors) {
				System.out.println("error:" + error);
			}
		}
		model.addAttribute("sysUser", sysUser);
		return "validate1";
	}
}
