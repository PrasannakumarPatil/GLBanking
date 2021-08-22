package com.greatlearning.services;

import com.greatlearning.model.*;
import java.util.*;
public class BankingService {
	Scanner sc = new Scanner(System.in);
	
	int bankbalance =1000;
	
	public void logout()
	{
		System.out.println("---Thanks for Banking with us----");
	}

	public void deposit(Customer customer)
	{
		int amt;
		System.out.println("Enter deposit amount");
		
		amt= sc.nextInt();
		if (amt>0)
		{
			
			customer.setBalance(customer.getBalance()+amt);
			System.out.println("Amount added successfully");
			System.out.println("Total Amount: "+customer.getBalance());
		}
		else {
			System.out.println("Invalid input");
		}
	}
	public void withdraw(Customer customer) {
		
		
		int amt;
		System.out.println("Enter the amount for withdrawal");
		amt=sc.nextInt();
		if(customer.getBalance()>=amt) {
			customer.setBalance(customer.getBalance()-amt);
			System.out.println("Amount withdrawn");
			System.out.println("Balance amount :" + customer.getBalance());
		}
		else {
			System.out.println("Invalid input");
		}
		
		
	}
	public void transfer(Customer customer) {
		
		int amt;
		int otp;
		int generatedOtp;
		int accountNumForTransfer;
		
		
		
		System.out.println("Enter OTP");
		
		
		OTPgenerator otpPin = new OTPgenerator();
		
		generatedOtp = otpPin.generateOTP();
		System.out.println(generatedOtp);
		otp = sc.nextInt();
		if (otp==generatedOtp) {
			System.out.println("OTP validated");
			
			System.out.println("Enter the transferable amount ");
			amt=sc.nextInt();
			System.out.println("Enter the account for amount to be transfered");
			accountNumForTransfer = sc.nextInt();
			
			if (customer.getBalance()>=amt) {
				customer.setBalance(customer.getBalance()-amt);
				System.out.println("Amount transfered");
				System.out.println("Balance :" +customer.getBalance());
			}else {
				System.out.println("Insufficient balance");
			}
		}
		
		
		
	}
}
