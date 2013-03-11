package com.elliot.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;

abstract interface Control {
	static final String OAUTH_CONSUMER_KEY = "interesting-software-product-name-5098";
	static final String OAUTH_CONSUMER_SECRET = "HQHZ8IESuapdUWEy";
	
	void control(HttpServletRequest request, HttpServletResponse response);
}
