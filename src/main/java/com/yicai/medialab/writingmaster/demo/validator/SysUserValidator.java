package com.yicai.medialab.writingmaster.demo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yicai.medialab.writingmaster.demo.entity.SysUser;

// 是否可以把检查用户名是否相等的dao注入到这里
public class SysUserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return SysUser.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "username.required");
	}

}
