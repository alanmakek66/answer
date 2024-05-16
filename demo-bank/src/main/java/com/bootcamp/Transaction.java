package com.bootcamp;

import java.util.Map;

public class Transaction implements TransactionInterface {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.accountNumber=accountNumber;
		this.bank=bank;

		bank.authenticateUser(accountNumber, attemptedPin);
		if(bank.authenticateUser(accountNumber, attemptedPin)==false){
			throw new Exception();
	}
	}

	public double getBalance() {
		// complete the function
		return this.bank.getAccount(this.accountNumber).getBalance();
	}

	public void credit(double amount) {
		// complete the function 
		this.bank.credit(this.accountNumber, amount);
		
	}

	public boolean debit(double amount) {
		if(this.bank.debit(accountNumber, amount)==true){
			return true;
		}return false;
	}
}
