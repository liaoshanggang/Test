package com.lanqiao.test8;

public class CountThread extends Thread{
	private int i = 0;
	
	public CountThread() {
		super("计数线程");
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+"计数："+(++i));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("捕获了InterruptedException异常");
			}
			System.out.println("1次");
		}
		
	}
}
