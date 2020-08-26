package com.globallogic.bootcampgl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ErrorDTO {

	@JsonProperty("message")
	private String message;
	@JsonProperty("status_code")
	private Integer statusCode;
	@JsonProperty("uri")
	private String uri;
}
