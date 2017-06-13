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
		System.out.println("自我介绍:姓名："+this.name+"健康值："+this.health+"亲密度："+this.love+"性别："+this.sex);
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
 