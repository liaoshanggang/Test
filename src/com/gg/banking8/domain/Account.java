package com.gg.banking8.domain;

import java.util.Iterator;

/**
 * 5�� �޸Ĵ����׳����쳣��ָ�����ʽ��㡱�Լ����������ǰ���۳���������
 * @author gg
 *
 */
public class Account {
	protected double balance;//������Ա����������ʻ��ĵ�ǰ���� ��ʱ����

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	//�÷������ڻ�ȡ������
	public double getBalance() {
		return balance;
	}
	
	//�÷�����ǰ������ӽ�
	public boolean deposit(double addMoney) {
		balance = balance + addMoney;
		return true;
	}
	
	//�ӵ�ǰ����м�ȥ��
	public void withdraw(double subMoney){
		if (subMoney>=balance) {
			throw new OverdraftException("�ʽ���",subMoney-balance);
		} 
		balance -= subMoney;
	}
	
}
