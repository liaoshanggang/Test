package com.gg.banking8.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	private List customer;
	private static Bank bank;

	private Bank() {
		// TODO 自动生成的构造函数存根
		customer = new ArrayList();
	}

	public static Bank getBanking() {
		if (bank == null) {
			bank = new Bank();
		}
		return bank;
	}

	public Customer getCustomer(int index) {
		return (Customer) customer.get(index);
	}
	
	public Iterator getCustomers() {
		Iterator it = customer.iterator();
		return it;
	}

	public void addCustomer(String f, String l) {
		Customer c = new Customer(f, l);
		customer.add(c);
	}

	public int getNumOfCustomers() {
		return customer.size();
	}
}
