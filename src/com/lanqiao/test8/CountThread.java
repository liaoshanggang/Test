package com.lanqiao.test8;

public class CountThread extends Thread{
	private int i = 0;
	
	public CountThread() {
		super("�����߳�");
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+"������"+(++i));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("������InterruptedException�쳣");
			}
			System.out.println("1��");
		}
		
	}
}
