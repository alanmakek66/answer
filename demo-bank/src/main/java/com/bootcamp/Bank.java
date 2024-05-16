package com.bootcamp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function

		return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long accountNo = Long.valueOf(this.accounts.size() + 1);

		CommercialAccount c1 = new CommercialAccount(company, accountNo, pin, startingDeposit);

		this.accounts.put(accountNo, c1);

		return accountNo;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long accountNo = Long.valueOf(this.accounts.size() + 1);

		ConsumerAccount p1 = new ConsumerAccount(person, accountNo, pin, startingDeposit);

		this.accounts.put(accountNo, p1);

		return accountNo;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		for (Map.Entry<Long, Account> test1 : this.accounts.entrySet()) {
			if (accountNumber == test1.getKey() && pin == test1.getValue().getPin()) {
				return true;
			}

		}
		return false;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		double d1 = -1.0;
		for (Map.Entry<Long, Account> test1 : this.accounts.entrySet()) {
			if (accountNumber == test1.getKey()) {
				d1 = test1.getValue().getBalance();

			}
		}

		return d1;
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		/* for (Map.Entry<Long, Account> test1 : this.accounts.entrySet()) {
			if (accountNumber == test1.getKey()) {
				test1.getValue().creditAccount(amount);
			}
		} */
		this.getAccount(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return this.getAccount(accountNumber).debitAccount(amount);
	}
}
