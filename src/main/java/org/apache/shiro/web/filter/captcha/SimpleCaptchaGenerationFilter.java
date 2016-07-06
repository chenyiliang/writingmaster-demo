package org.apache.shiro.web.filter.captcha;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.captcha.SimpleCaptcha;
import org.apache.shiro.web.servlet.OncePerRequestFilter;

public class SimpleCaptchaGenerationFilter extends OncePerRequestFilter {

	private SimpleCaptcha simpleCaptcha = new SimpleCaptcha();

	public void setSimpleCaptcha(SimpleCaptcha simpleCaptcha) {
		this.simpleCaptcha = simpleCaptcha;
	}

	@Override
	protected void doFilterInternal(ServletRequest request, ServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		resp.setDateHeader("Expires", 0L);
		resp.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		resp.addHeader("Cache-Control", "post-check=0, pre-check=0");
		resp.setHeader("Pragma", "no-cache");
		resp.setContentType("image/jpeg");

		try (ServletOutputStream out = resp.getOutputStream()) {
			// 生成随机字串
			String captcha = simpleCaptcha.generateVerifyCode(4);
			// 存入会话session
			HttpSession session = req.getSession();
			session.setAttribute("realCaptcha", captcha.toLowerCase());
			// 生成图片
			int w = 200, h = 45;
			simpleCaptcha.outputImage(w, h, response.getOutputStream(), captcha);
		}
	}

}
