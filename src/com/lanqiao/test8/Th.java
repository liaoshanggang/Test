package com.lanqiao.test8;

public class Th extends Thread {

	@Override
	public void run() {
		int count = 0;
		while(true){
			try {
				System.out.println("ִ��"+(++count)+"��");
				System.out.println("ʹ��Thread.interrupted()���жϵ�״̬��"+this.isInterrupted());
				Thread.sleep(2000);
				System.out.println("sleep����");
				this.interrupt();
				System.out.println("�Ƿ��жϣ�"+this.isInterrupted());
				System.out.println("2���жϵ�״̬��"+Thread.interrupted());
				System.out.println();
			} catch (InterruptedException e) {
				break;
			}
		}
		System.out.println("hehe");
	}

}
class Test{
	public static void main(String[] args) {
		new Th().start();
	}
}