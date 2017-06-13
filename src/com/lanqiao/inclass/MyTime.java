package com.lanqiao.inclass;
/*在程序中，经常要对时间进行操作，但是并没有时间类型的数据。那么，我们可以自己实现一个时间类，来满足程序中的需要。 
定义名为MyTime的类，
其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，
这三个成员变量应声明为私有private。 
为MyTime类定义构造方法，以方便创建对象时初始化成员变量。 
再定义diaplay方法，用于将时间信息打印出来，以及定义一个test方法，用于校验时间是否正确。
为MyTime类添加以下方法，分别对时、分、秒进行加和减运算： 
addSecond(int sec) 
addMinute(int min) 
addHour(int hou) 
subSecond(int sec) 
subMinute(int min) 
subHour(int hou) */

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
		// TODO 自动生成的构造函数存根
	}
	//创建对象时初始化成员变量。 
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//将时间信息打印出来
	public void display(){
		System.out.println("当前时间为："+this.hour+"时"+this.minute+"分"+this.second+"秒");
	}
	//用于校验时间是否正确。
	public void test(){
		
	}
	public void addSecond(int sec){
		
	}
	public void addMinute(int min){
		
	}
	public void addHour(int hour){
		
	}
	public void subSecond(int sec){
		
	}
	public void subMinute(int min){
		
	}
	public void subHour(int hou){
		
	}
}
