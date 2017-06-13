package com.gg.banking8.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	private String firstName;
	private String lastName;
	private List accounts = new ArrayList();
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void addAccount(Account a){
		accounts.add(a);
	}
	
	public Account getAccount(int i){
		return (Account) accounts.get(i);
	}
	
	public Iterator getAccounts(){
		return accounts.iterator();
	}
	
	public int getNumOfAccounts(){
		return accounts.size();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	/*public Account getAccount() {
		return account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}*/
	
	
}
