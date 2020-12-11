package com.icicibank.apimgmt.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.model.RequestModel;
import com.icicibank.apimgmt.model.ResponseModel;

@Service
public interface HashingService {

	
	public ResponseModel generateAndVerifySignature(RequestModel requestModel) throws InvalidKeyException, SignatureException, NoSuchAlgorithmException, UnsupportedEncodingException;
}
