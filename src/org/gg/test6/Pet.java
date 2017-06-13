package org.gg.test6;

public class Pet {
	String name;
	int health;
	int love;
	public Pet(){
		
	}
	
	public Pet(String name,int health,int love){
		this.name = name;
		this.health = health;
		this.love = love;
	}
	void print(){
		System.out.println("自我介绍:姓名："+this.name+"健康值："+this.health+"亲密度："+this.love);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}
	
}
 