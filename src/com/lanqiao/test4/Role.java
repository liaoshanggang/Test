package com.lanqiao.test4;

/**
 * 
 * ������������һ�������"Role"�࣬�����������䣬�Ա�ȳ�Ա����
 * 1.Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����)��
 * ��ͨ��GetXXX()��SetXXX()�����Ը��������ж�д������һ�������play()������
 * �÷����������κ�ֵ��ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷���
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
