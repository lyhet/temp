package com.gold.auction.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gold.auction.model.TestTempVO;
import com.gold.auction.service.TestTempService;

/**
 * 
 * @author yhlee
 *
 */
@Controller
public class TestTempController {
	
	@Autowired
	TestTempService testTempService;
	
	
	@Value("#{sysprop['author.name1']}")
	private String author1;
	
	@Value("#{sysprop['author.name2']}")
	private String author2;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	
	@RequestMapping(value = "/testTemp")
	public String testTemp(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		String no = request.getParameter("no");
		
		TestTempVO inputTestTempVO = new TestTempVO();
		inputTestTempVO.setNo(no);
		
		logger.info("author1:"+author1);
		logger.info("author2:"+author2);
		
		
		
		TestTempVO testTempVO  = testTempService.getTestTemp(inputTestTempVO);
						
		model.addAttribute("testTempVO", testTempVO);
		model.addAttribute("author1", author1);
		model.addAttribute("author2", author2);
		
		
		
		
		return "/test/testTemp";
	}
}
