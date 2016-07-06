package org.apache.shiro.web.filter.captcha;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

public class SimpleCaptchaValidationFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		HttpServletRequest req = WebUtils.toHttp(request);
		if (!"post".equalsIgnoreCase(req.getMethod())) {
			return true;
		}
		HttpSession session = req.getSession(false);
		if (session == null) {
			return false;
		}
		String inputCaptcha = req.getParameter("captcha");
		String realCaptcha = (String) session.getAttribute("realCaptcha");
		System.out.println("inputCaptcha:" + inputCaptcha);
		System.out.println("realCaptcha:" + realCaptcha);
		if (realCaptcha == null) {
			return false;
		} else {
			session.removeAttribute("realCaptcha");
		}
		return realCaptcha.equals(inputCaptcha);
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		return false;
	}

}
