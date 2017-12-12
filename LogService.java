package com.daas.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogService {
	private Logger logger=LoggerFactory.getLogger(LogService.class);
	
	@RequestMapping("/loggg")
	public String home(){
		logger.info("info.....");
		logger.debug("debug.....");
		logger.warn("warn.....");
		logger.error("error.....");
		
		return "test";
		
	}

}