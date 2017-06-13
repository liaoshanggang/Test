package com.gg.banking8.domain;
//´¢ĞîÕË»§
public class SavingAccount extends Account {
	double interestRate;//ÀûÂÊ

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
}
