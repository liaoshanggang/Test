package com.gg.banking8.domain;

public class CheckingAccount extends Account {
	double overdraftProtection = -1;//͸֧������
	
	public CheckingAccount(double balance) {
		super(balance);
		// TODO �Զ����ɵĹ��캯�����
	}

	public CheckingAccount(double balance, double overdraftProtection) {
		super(balance);
		this.overdraftProtection = overdraftProtection;
	}
	
	/*7�� �޸Ĵ���ʹ������Ҫʱ�׳��쳣���������Ҫ������һ�Ǵ���û��͸֧��
	���ĳ��֣�������쳣ʹ�á�no overdraft protection����Ϣ���ڶ���
	overdraftProtection �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� �� ʹ
	�� ��Insufficient funds for overdraft protection�� ��Ϣ*/
	@Override
	public void withdraw(double subMoney) {
		// TODO �Զ����ɵķ������
		//����㹻
		if (subMoney<balance) {
			balance = balance - subMoney;
		} else {
			//͸֧�����㹻
			if(overdraftProtection!=-1){
				overdraftProtection -= subMoney-balance;
				balance = 0;
				throw new OverdraftException("Insufficient funds for overdraft protection");
			}else{//����,��͸֧��������
				throw new OverdraftException("no overdraft protection", subMoney-balance);
			}
		}
		
		/*else if (subMoney<balance+overdraftProtection) {
			balance += overdraftProtection - subMoney;
			return true;
		} else {
			System.out.println("����ʧ�ܣ�");
			return false;
		}*/
	}
	
	
	
	

}
