package org.gg.test6_1;

public class Dog extends Pet{
	private String strain;
	public Dog(){
		
	}
	public Dog(String name,int health,int love,String strain){
		super(name,health,love);
		this.strain = strain;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("自我介绍:姓名："+this.name+"健康值："+this.health+"亲密度："+this.love+"品种："+this.strain);
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	
}
 