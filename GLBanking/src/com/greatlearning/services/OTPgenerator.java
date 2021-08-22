package com.greatlearning.services;

public class OTPgenerator {

	
	public int generateOTP() {
		
		
		int randomOTP = (int)(Math.random()*9000)+1000;
		return randomOTP;
	}
}
