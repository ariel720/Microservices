package com.ariel.demo.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	//TimeStamp : when this happens
	private Date timestamp;
	private String message;
	private String details;
	
	//create Constructor & getters
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}


	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
	
}
