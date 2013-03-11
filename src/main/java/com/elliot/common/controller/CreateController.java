package com.elliot.common.controller;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import org.springframework.security.oauth.consumer.client.CoreOAuthConsumerSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/create")
public class CreateController implements Control {

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public void control(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("url"));
		/*
		try {
			OAuthConsumer consumer = new DefaultOAuthConsumer(OAUTH_CONSUMER_KEY, OAUTH_CONSUMER_SECRET);
			URL url = new URL(request.getParameter("url"));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			consumer.sign(request);
			connection.connect();
		}
		catch (Exception e) {
			
		}*/
		//CoreOAuthConsumerSupport consumer = new CoreOAuthConsumerSupport();
	}
	
}