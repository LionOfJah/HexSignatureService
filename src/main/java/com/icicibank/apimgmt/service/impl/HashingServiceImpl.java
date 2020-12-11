package com.icicibank.apimgmt.service.impl;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.model.RequestModel;
import com.icicibank.apimgmt.model.ResponseModel;
import com.icicibank.apimgmt.model.Validate;
import com.icicibank.apimgmt.service.HashingService;

@Service
public class HashingServiceImpl implements HashingService {

	
	@Value("${app.hash.key}")
	String hashKey;
	
	@Autowired
	ResponseModel responseModel;
	
	
	private static final String HMAC_SHA512 = "HmacSHA512";
	
	public Logger logger = LoggerFactory.getLogger(HashingServiceImpl.class);
	

	@Override
	public ResponseModel generateAndVerifySignature(RequestModel requestModel) throws InvalidKeyException, SignatureException, NoSuchAlgorithmException, UnsupportedEncodingException {
		Validate validate=requestModel.getValidate();
		String data=validate.getVan_account()+validate.getTransfer_timestamp()+validate.getTransfer_amt()+validate.getTransfer_unique_no()+validate.getBene_account_no();
		
		logger.info(" hashKey "+hashKey);
		String result=calculateHMAC(data, hashKey);
	
		
		responseModel.setStatus("success");
		responseModel.setSignature(result);
		return responseModel;
	}
	
	private  String toHexString(byte[] bytes) {
	    Formatter formatter = new Formatter();
	    for (byte b : bytes) {
	        formatter.format("%02x", b);
	    }
	    
	    String result=formatter.toString();
	    
	    
	    
	    /*
	     * Another logic for conversion of bytes into hex format
	     * 
	     * */
	    
		/*
		 * StringBuilder sb = new StringBuilder((bytes.length * 2)); //initiate string
		 * builder object with double length of byte array
		 * 
		 * for (int i = 0; (i < bytes.length); i++) // loop on length of byte array
		 * 
		 * {
		 * 
		 * Integer v = (bytes[i] & 255); // If either of the bits is 0, the result is 0.
		 * Otherwise the result is 1.
		 * 
		 * //logger.info(" v "+v); if ((v < 16)) //if less than 16 then append the zero
		 * to string builder object
		 * 
		 * {
		 * 
		 * sb.append('0');
		 * 
		 * }
		 * 
		 * sb.append( Integer.toHexString(v)); //"X" is a format specifier. It converts
		 * a number to a string of hexadecimal digits.
		 * 
		 * } logger.info(" string builder "+sb.toString());
		 */
        formatter.close();
	    return result;
	}

	public  String calculateHMAC(String data, String key)
	    throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException
	{
		logger.info(" data "+data);
		byte[] keyBytes=key.getBytes();
	    SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, HMAC_SHA512);
	    Mac mac = Mac.getInstance(HMAC_SHA512);
	    mac.init(secretKeySpec);
	    byte [] dataArray=mac.doFinal(data.getBytes());
	    return toHexString(dataArray);
	}

}
