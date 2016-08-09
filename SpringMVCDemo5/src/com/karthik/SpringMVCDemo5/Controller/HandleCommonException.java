package com.karthik.SpringMVCDemo5.Controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HandleCommonException {
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = IOException.class)
	public String handleNullPointerException(Exception exception) {

		System.out.println("Logging IO Exception : "+exception);
		return "IOException";
	}

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception exception) {
		System.out.println("Logging Exception : "+exception);
		return "Exception";
	}
}
