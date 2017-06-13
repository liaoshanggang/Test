package com.forward.date20170508.singleinstance.demo3;
/**
 * @Description: 安全同步,加锁在类字节对象上，这样的用法，在性能上会有所下降，
 * 因为每次调用getInstance()，都要对对象上锁
 * @author forward
 * @date 2017年5月9日 下午1:34:33
 * @version V2.0
 */
public class SingleInstance1 {
	private static SingleInstance1 instance = null;
	
	private SingleInstance1(){
		
	}
	
	public synchronized SingleInstance1 getSingleInstance1(){
		if(instance==null){
			instance = new SingleInstance1();
		}
		return instance;
	}
}
