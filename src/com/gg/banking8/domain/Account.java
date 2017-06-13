package com.gg.banking8.domain;

import java.util.Iterator;

/**
 * 5． 修改代码抛出新异常，指明“资金不足”以及不足数额（当前余额扣除请求的数额）
 * @author gg
 *
 */
public class Account {
	protected double balance;//这个属性保留了银行帐户的当前（或 即时）余额。

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	//该方法用于获取经常余额。
	public double getBalance() {
		return balance;
	}
	
	//该方法向当前余额增加金额。
	public boolean deposit(double addMoney) {
		balance = balance + addMoney;
		return true;
	}
	
	//从当前余额中减去金额。
	public void withdraw(double subMoney){
		if (subMoney>=balance) {
			throw new OverdraftException("资金不足",subMoney-balance);
		} 
		balance -= subMoney;
	}
	
}
