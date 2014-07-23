package com.longbeach.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ApiIntercepter extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory
			.getLogger(ApiIntercepter.class);

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("response=" + response.getContentType() + "  "
				+ response.getClass().getName() + "    =="
				+ request.getContextPath());

		super.afterCompletion(request, response, handler, ex);
	}
}
