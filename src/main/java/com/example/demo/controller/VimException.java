package com.example.demo.controller;

import org.springframework.http.HttpStatus;

public class VimException extends Exception {
	
	private static final long serialVersionUID = 1L;
	HttpStatus httpStatus;
	
	public VimException(String msg, HttpStatus status) {
		super(msg);
		httpStatus = status;
	}
	
	public VimException(String msg) {
		super(msg);
		httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
