package com.forward.date20170508.singleinstance.demo3;

/**
 * @Description: 安全同步,实际情况是，单例模式使用内部类来维护单例的实现，
 * JVM内部的机制能够保证当一个类被加载的时候，
 * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，
 * @author forward
 * @date 2017年5月9日 下午1:34:33
 * @version V2.0
 */
public class SingleInstance5 {
	//私有构造方法，防止被实例化
	private SingleInstance5() {
	}
	//此处使用一个内部类来维护单例 
	private static class SingleFactory{
		private static SingleInstance5 instance = new SingleInstance5();
	}
	//获取单例
	public static SingleInstance5 getSingleInstance5(){
		return SingleFactory.instance;
	}
	//如果该对象被用于序列化，可以保证对象在序列化前后保持一致 
    public Object readResolve() {  
        return getSingleInstance5();  
    } 
}
