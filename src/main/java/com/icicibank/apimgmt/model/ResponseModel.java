package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel {

	private String status;
	
	private String signature;
	
	private String errorMessage;

	public ResponseModel() {
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
