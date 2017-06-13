package com.lanqiao.test2;
/**
 * 2、定义一个表示学生信息的类Student，要求如下：（50分）
 * （1）类Student的成员变量：
 * sNo表示学号， sName表示姓名， sSex表示性别， sAge表示年龄， sJava 表示java课程成绩。
 * （2）类Student带参数的构造方法：
 * 在构造方法中通过形参完成对成员变量的赋值操作。
 * （3）类Student的方法成员：
 * getNo：获得学号
 * getName:获得姓名
 * getSex:获得性别
 * getAge:获得年龄
 * @author Administrator
 *
 */
public class Student {
	int sNo;// 学号
	String sName;// 姓名
	char sSex;// 性别
	int sAge;// 年龄
	double sJava; // java课程成绩

	public Student(int sNo, String sName, char sSex, int sAge, double sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	public int getsNo() {
		return sNo;
	}

	public String getsName() {
		return sName;
	}

	public char getsSex() {
		return sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public double getsJava() {
		return sJava;
	}
}
