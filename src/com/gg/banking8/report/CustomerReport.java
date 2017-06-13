package com.gg.banking8.report;

import java.util.Iterator;

import com.gg.banking8.domain.Account;
import com.gg.banking8.domain.Bank;
import com.gg.banking8.domain.CheckingAccount;
import com.gg.banking8.domain.Customer;
import com.gg.banking8.domain.SavingAccount;

public class CustomerReport {

	public void generateReport() {
		Bank bank = Bank.getBanking();
		Customer customer ;

		// Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");
		
		Iterator itBank = bank.getCustomers();
		
		while(itBank.hasNext()){
			customer = (Customer) itBank.next();
			Iterator itCustomer = customer.getAccounts();
			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", "
					+ customer.getFirstName());
			while(itCustomer.hasNext()){
				Account account = (Account) itCustomer.next();
				String account_type = "";

				// Determine the account type
				/***
				 * Step 1: Use the instanceof operator to test what type of
				 * account we have and set account_type to an appropriate value,
				 * such as "Savings Account" or "Checking Account".
				 ***/
				if (account instanceof SavingAccount) {
					account_type = "Savings Account";
				} else if (account instanceof CheckingAccount) {
					account_type = "Checking Account";
				}

				// Print the current balance of the account
				/***
				 * Step 2: Print out the type of account and the balance. Feel
				 * free to use the currency_format formatter to generate a
				 * "currency string" for the balance.
				 ***/
				System.out.println(account_type + ":current balance"
						+ account.getBalance());
			}
		}
	}

}
