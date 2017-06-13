package com.gg.banking8.domain;

public class CheckingAccount extends Account {
	double overdraftProtection = -1;//透支保护额
	
	public CheckingAccount(double balance) {
		super(balance);
		// TODO 自动生成的构造函数存根
	}

	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	/*7． 修改代码使其在需要时抛出异常。两种情况要处理：第一是存在没有透支保
	护的赤字，对这个异常使用“no overdraft protection”信息。第二是
	overdraftProtection 数 额 不 足 以 弥 补 赤 字 ： 对 这 个 异 常 可 使
	用 ”Insufficient funds for overdraft protection” 信息*/
	@Override
	public void withdraw(double subMoney) {
		// TODO 自动生成的方法存根
		//余额足够
		if (subMoney<balance) {
			balance = balance - subMoney;
		} else {
			//透支保护足够
			if(overdraftProtection!=-1){
				overdraftProtection -= subMoney-balance;
				balance = 0;
				throw new OverdraftException("Insufficient funds for overdraft protection");
			}else{//余额不足,且透支保护不够
				throw new OverdraftException("no overdraft protection", subMoney-balance);
			}
		}
		
		/*else if (subMoney<balance+overdraftProtection) {
			balance += overdraftProtection - subMoney;
			return true;
		} else {
			System.out.println("交易失败！");
			return false;
		}*/
	}
	
	
	
	

}
