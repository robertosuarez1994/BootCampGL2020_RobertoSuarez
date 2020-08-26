package com.globallogic.bootcampgl.vehiculo.error;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.globallogic.bootcampgl.vehiculo.DTO.ErrorDTO;


@ControllerAdvice
public class vehicleServiceErrorHandler {
	
	@ExceptionHandler({NoSuchElementException.class})
	public ResponseEntity<Object> handleHttpMessageNotReadableException(final NoSuchElementException e) {
		ErrorDTO responseError = new ErrorDTO();
		responseError.setMessage("Elemento no Encontrado");
		responseError.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseError.setUri("/products");
		return new ResponseEntity<>(responseError,HttpStatus.BAD_REQUEST);
	}
}
