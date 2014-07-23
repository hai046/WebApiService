package com.longbeach.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longbeach.services.ApkService;
import com.longbeach.utils.JsonUtils;

@Controller
public class ApiController {

	@Autowired
	private ApkService mApkService;
	private static final Logger logger = LoggerFactory
			.getLogger(ApiController.class);

	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public @ResponseBody String getCurrentVersion(HttpServletResponse response) {
		logger.warn("request api ");
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		return "home";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(HttpServletRequest request,HttpServletResponse response) {
		request.setAttribute("apks", mApkService.getCurrentApks());
		response.setContentType("text/html");
		return "apklist";
	}

	@RequestMapping(value = "/apks", method = RequestMethod.GET)
	public @ResponseBody String getCurrentApks(HttpServletResponse response) {

		return JsonUtils.getResultByJson(mApkService.getCurrentApks());
	}

	@RequestMapping(value = "/apk", method = RequestMethod.GET)
	public @ResponseBody String getFile(HttpServletResponse response) {

		return JsonUtils.getResultByJson(mApkService.getCurrentApks());
	}

}
