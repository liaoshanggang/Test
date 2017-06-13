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
		//中断线程的堵塞状态（而非中断线程）
		t.interrupt();
	}
}
