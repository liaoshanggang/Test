package com.lanqiao.test8;

public class InterruptThread {
	public static void main(String[] args) {
		CountThread t = new CountThread();
		t.start();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//�ж��̵߳Ķ���״̬�������ж��̣߳�
		t.interrupt();
	}
}
