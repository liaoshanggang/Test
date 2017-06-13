package com.forward.date20170508.singleinstance.demo2;
/**
 * @Description: 懒汉式单例模式
 * @author forward
 * @date 2017年5月9日 下午1:34:08
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
