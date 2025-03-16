package com.liveasy.loadsapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PayloadNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3263776052128848081L;

	public PayloadNotFoundException(String message) {
		super(message);
	}
}
