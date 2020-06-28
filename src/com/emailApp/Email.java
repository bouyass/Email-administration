package com.emailApp;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String departement;
	private int mailboxCapacity;
	private String alternateEmail;
	private final String COMPANY_SUFFIX = "lyes_comany.com";
	private final int PASSWORD_SIZE = 20;
	
	// constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// ask for departement 
		this.departement = this.setDepartement();
		
		// set the password
		this.password = this.setPassword();

		
		// generating the email 
		this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.departement+"."+COMPANY_SUFFIX;
		
		
		System.out.println("Entry "+ this.firstName+ " "+this.lastName+" in the "+this.departement+" departement"+ " with "+this.password+
				" as password");
		System.out.println("the generated email "+ this.email);
		
	}

	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	// change password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	// setting up the departement 
	private String setDepartement() {
		System.out.println("Enter the code new entry's departement please \n1 sales\n2 for Developpement \n3 for Accounting \n0 for none ");
		Scanner sc = new Scanner(System.in);
		int dpt = sc.nextInt();
		switch(dpt) {
		case 0:
			return "";
		case 1:
			return "sales";
		case 2:
			return "developpement";
		case 3:
			return "accounting";
		}
		
		return "";
	}
	
	// generate the password 
	private String setPassword() {
		String passwordMODEL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&£*µ";;
		String password = "";
		for(int i = 0; i<PASSWORD_SIZE;i++) {
			int index = ThreadLocalRandom.current().nextInt(0,61);
			password+=passwordMODEL.charAt(index);
		}
		return password;
	}
	
	
	
	
	
	
	

}
