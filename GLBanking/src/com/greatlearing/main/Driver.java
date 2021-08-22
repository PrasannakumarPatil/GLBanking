package com.greatlearing.main;

import com.greatlearning.services.*;
import com.greatlearning.model.*;

import java.util.*;
public class Driver {

	
	
	public static void main(String [] args) 
	{
	BankingService bankingService= new BankingService();
	
	Customer customer1 =new Customer("1122",109876);
	
//	Customer customer2 = new Customer (password:"123",acc_number: 99999);
	
	Scanner sc = new Scanner(System.in);
	
	String password;
	int accNumber;
	
	System.out.println("Welcome to login page");
	
	System.out.println("Enter your account number");
	
	accNumber = sc.nextInt();
	
	System.out.println("Enter your password");
	
	password = sc.next();
	
	
	Customer loggedInCustomer = new Customer(password, accNumber);
	
	if(validate(loggedInCustomer,customer1)) {
		
		int option=0;
		do {
			System.out.println();
			System.out.println("1.Deposit" +"\n"+"2.Withdraw"+"\n"+"3.Transfer"+"\n"+"0.Logout");
			option =sc.nextInt();
			switch (option) {
				case 0:
					option=0;
					bankingService.logout();
					break;
				case 1:
					bankingService.deposit(loggedInCustomer);
					break;
				
				case 2:
					bankingService.withdraw(loggedInCustomer);
					break;
				case 3:
					bankingService.transfer(loggedInCustomer);
					break;
					
			}
			
		}while(option!=0);
	}else
	{
		System.out.println("Invalid Credentials");
	}
	
	
	
	
	
	}
	
	
	
	
private static boolean validate(Customer loggedInCustomer, Customer customer1) {
		
		return loggedInCustomer.getAcc_number()==customer1.getAcc_number() && loggedInCustomer.getPassword().equals(customer1.getPassword());
	}
	
	
	
	

}
