package com.lanqiao.test4;

/**
 * 
 * （二）、定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
 * 1.要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，
 * 再通过GetXXX()和SetXXX()方法对各变量进行读写。具有一个抽象的play()方法，
 * 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
 * @author Administrator
 *
 */
public abstract class Role {
	protected String name;
	protected int age;
	protected char sex;
	
	public abstract void play();
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
}
