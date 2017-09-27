package com.example.demo.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Config;
//import org.apache.commons.collections.map.CaseInsensitiveMap;
@RestController
@RequestMapping("/test")
public class Test {
	@Value("p1")
	String p1;
	@Autowired Config conf;
	@RequestMapping(value = "/1", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String ListHistoryMetrics(
			//HttpServletRequest request
			@RequestParam Map<String, Object> params
			//@RequestParam(value="aaa") String aaa
			) throws VimException{
		
		throw new VimException("zhanghan", HttpStatus.NOT_FOUND);
		
		//System.out.println("aaaaaa");

		//return "test1";
	}
	
	
	
}

