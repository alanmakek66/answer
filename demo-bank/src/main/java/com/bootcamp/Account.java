package com.bootcamp;

import java.math.BigDecimal;

public abstract class Account  {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;
  
  

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
    this.accountHolder=accountHolder;
    this.accountNumber=accountNumber;
    this.pin=pin;
    this.balance=startingDeposit;
}

	public AccountHolder getAccountHolder() {
		// complete the function
    if(this.accountHolder.equals(null)){
		return null;}
    return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
    if(attemptedPin==this.pin){
		return true;}
    return false;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return Integer.valueOf(this.pin);
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		// BigDecimal
		//BigDecimal bigamount= BigDecimal.valueOf(amount);
		
		/* BigDecimal b1= BigDecimal.valueOf(amount);
		BigDecimal b2= BigDecimal.valueOf(this.balance);
		double newBalance=(b1.add(b2)).doubleValue(); */

		double b1= this.balance;
		double newBalance =b1+amount;
		
		this.balance= newBalance;
		
	}

	public boolean debitAccount(double amount) {
		// complete the function
		boolean result =this.balance>=amount;
		if(result){
			this.balance=this.balance-amount;
			return true;
		} return false;
		
	}

	
}