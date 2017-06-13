package com.lanqiao.test8;

public class Th extends Thread {

	@Override
	public void run() {
		int count = 0;
		while(true){
			try {
				System.out.println("执行"+(++count)+"次");
				System.out.println("使用Thread.interrupted()后中断的状态："+this.isInterrupted());
				Thread.sleep(2000);
				System.out.println("sleep结束");
				this.interrupt();
				System.out.println("是否中断："+this.isInterrupted());
				System.out.println("2、中断的状态："+Thread.interrupted());
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