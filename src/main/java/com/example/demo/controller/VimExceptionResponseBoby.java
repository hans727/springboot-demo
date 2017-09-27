package com.example.demo.controller;

public class VimExceptionResponseBoby {
	private int status;
	private String error;
	private String message;
	private String path;
	private String exception;
	private String timestamp;
	
	public VimExceptionResponseBoby() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "VimExceptionResponseBoby [status=" + status + ", error=" + error + ", message=" + message + ", path=" + path
				+ ", exception=" + exception + ", timestamp=" + timestamp + "]";
	}


	public VimExceptionResponseBoby(int status, String error, String message, String path, String exception,
			String timestamp) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
		this.exception = exception;
		this.timestamp = timestamp;
	}


	public int getStatus() {
		return status;
	}
	public void setStatus(int  status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}


