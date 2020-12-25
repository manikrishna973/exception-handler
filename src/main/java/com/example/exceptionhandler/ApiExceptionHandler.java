package com.example.exceptionhandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(value = { ApiRequestException.class })
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException exception) {

		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

		ApiException apiException = new ApiException(exception.getMessage(), httpStatus,
				ZonedDateTime.now(ZoneId.of("Z")));

		return new ResponseEntity<Object>(apiException, httpStatus);

	}

}
