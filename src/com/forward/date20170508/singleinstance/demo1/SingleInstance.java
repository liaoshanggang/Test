package com.forward.date20170508.singleinstance.demo1;
/**
 * @Description: 饿汉式单例模式
 * @author forward
 * @date 2017年5月9日 下午1:21:44
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
