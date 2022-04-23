package com.springboot.web.exceptioncontroller;

import com.springboot.web.exception.ItemException;
import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	@ExceptionHandler(ItemException.class)
	public ResponseEntity<String> handelEmptyInput(ItemException itemException){
		return new ResponseEntity<String>(itemException.getErrMess(), null, HttpStatus.SC_BAD_REQUEST);
	}

}
