package com.forward.date20170508.singleinstance.demo2;
/**
 * @Description: ����ʽ����ģʽ
 * @author forward
 * @date 2017��5��9�� ����1:34:08
 * @version V2.0
 */
public class SingleInstance {
	private static SingleInstance instance = null;
	private static int count = 0;
	private SingleInstance() {
		System.out.println("count:"+(++count));
	}
	
	public static SingleInstance getSingleInstance(){
		if(instance==null){
			instance = new SingleInstance();
		}
		return instance;
	}
	
	public void show(){
		System.out.println("hello");
	}
}
