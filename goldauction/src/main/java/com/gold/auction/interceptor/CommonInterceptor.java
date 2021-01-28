package com.gold.auction.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gold.auction.controller.TestTempController;

public class CommonInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
				
			logger.info("======================= START ===================================");
			logger.info("getRequestURI() \t: "+request.getRequestURI());
			logger.info("getRemoteAddr() \t: "+request.getRemoteAddr());
						
		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("======================= END ===================================");
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
	
	
	
	
	

}
