package com.icicibank.apimgmt.controller;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icicibank.apimgmt.model.RequestModel;
import com.icicibank.apimgmt.model.ResponseModel;
import com.icicibank.apimgmt.service.HashingService;

@RestController
public class HashingApiController {

	
	public static Logger logger = LoggerFactory.getLogger(HashingApiController.class);
	
	@Autowired
	ResponseModel responseModel;
	
	@Autowired
	HashingService service;
	
	@PostMapping(value="/api/v0/generateHashSignature",consumes="application/json",produces="application/json")
	public ResponseEntity<ResponseModel> generateAndVerifyHashSignature(@RequestBody RequestModel requestModel){
		
		logger.info(" requestModel "+requestModel.toString());
		
		try {
			responseModel = service.generateAndVerifySignature(requestModel);
		} catch (InvalidKeyException | SignatureException | NoSuchAlgorithmException | UnsupportedEncodingException e) {
			responseModel.setStatus("Fail");
			responseModel.setErrorMessage(e.getMessage());
		}
		
		return ResponseEntity.ok().body(responseModel);
	} 
}
