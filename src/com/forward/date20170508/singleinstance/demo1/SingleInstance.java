package com.forward.date20170508.singleinstance.demo1;
/**
 * @Description: ����ʽ����ģʽ
 * @author forward
 * @date 2017��5��9�� ����1:21:44
 * @version V2.0
 */
public class SingleInstance {
	private static SingleInstance sinInstance = new SingleInstance();
	private static int count = 0;
	private SingleInstance(){
		count ++;
		System.out.println("count:"+count);
	}
	
	public static SingleInstance getSingleInstance(){
		return sinInstance;
	}
	
	public void show(){
		System.out.println("hello");
	}
}
