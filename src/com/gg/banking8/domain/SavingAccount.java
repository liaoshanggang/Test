package com.gg.banking8.domain;
//�����˻�
public class SavingAccount extends Account {
	double interestRate;//����

	public SavingAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
}
