package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class VimExceptionHandler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@ExceptionHandler(value=VimException.class)
	@ResponseBody
	public ResponseEntity<VimExceptionResponseBoby> jsonErrorHandler(HttpServletRequest req, VimException e) throws Exception {
		//ResponseEntity<String> ent = new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		
		VimExceptionResponseBoby res = new VimExceptionResponseBoby();
		res.setStatus(e.httpStatus.value());
		res.setMessage(e.getMessage());
		res.setError(e.httpStatus.name());
		res.setPath(req.getRequestURI());
		res.setException(e.getClass().toString());
		
		 SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MM-dd hh:mm"); 
		 dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));	
		 res.setTimestamp(dateFormatGmt.format(new Date()));
		 logger.error("Exception! " + res.toString() + e.);
		 if(logger.isDebugEnabled() || logger.isTraceEnabled())
			 e.printStackTrace();
		
		return new ResponseEntity<VimExceptionResponseBoby>(res, e.httpStatus);		
	}
}
