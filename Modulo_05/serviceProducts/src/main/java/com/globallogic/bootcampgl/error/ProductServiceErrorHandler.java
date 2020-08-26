package com.globallogic.bootcampgl.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpStatusCodeException;

import com.globallogic.bootcampgl.dto.ErrorDTO;

@ControllerAdvice
public class ProductServiceErrorHandler {
	
	@ExceptionHandler({HttpMessageNotReadableException.class})
	public ResponseEntity<Object> handleHttpMessageNotReadableException(final HttpMessageNotReadableException e) {
		ErrorDTO responseError = new ErrorDTO();
		responseError.setMessage("ERRROOOORRR revisa el body papa");
		responseError.setStatusCode(400);
		responseError.setUri("/products");
		return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({MethodArgumentNotValidException.class})
	public ResponseEntity<Object>handleMethodArgumentNotValidException(final MethodArgumentNotValidException e){
		ErrorDTO responseError = new ErrorDTO();
		responseError.setMessage("Capo hay cosas vacias");
		responseError.setStatusCode(400);
		responseError.setUri("/products");
		return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
	}
}
