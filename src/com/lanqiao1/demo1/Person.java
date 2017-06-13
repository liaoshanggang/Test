package com.lanqiao1.demo1;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>4||name.length()<2){//
			System.out.println("你输入的姓名长度有误！");
		}else{
			this.name = name;
			System.out.println(name);
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
