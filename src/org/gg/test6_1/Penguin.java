package org.gg.test6_1;

public class Penguin extends Pet{
	private String sex;
	public Penguin(){
		
	}
	public Penguin(String name,int health,int love,String sex){
		super(name,health,love);
		this.sex = sex;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("���ҽ���:������"+this.name+"����ֵ��"+this.health+"���ܶȣ�"+this.love+"�Ա�"+this.sex);
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
 