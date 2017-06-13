package com.lanqiao.date20170418;

import java.util.ArrayList;
import java.util.List;

public class TestProdCons {
	private static final List<Integer> hotDogs = new ArrayList<>();
	
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			new Producer(i).start();
		}
		for (int i = 1; i <= 5; i++) {
			new Consumer(i).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	private static class Producer extends Thread{
		int i = 1;//��¼�ȹ�������
		int pid = -1;
		
		public Producer(int pid) {
			this.pid = pid;
		}

		@Override
		public void run() {
			while(true){
				try {
					//ģ������ʱ��
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (hotDogs){
					if(i<10){
						hotDogs.add(pid*10000+i);
						System.out.println("��"+this.pid+"����������������һ���ȹ������Ϊ��"+(pid*10000+i));
						i++;
						hotDogs.notifyAll();
					}else{
						System.out.println("�ȹ����Ѿ�10�����ȴ����ѣ�");
						try {
							hotDogs.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	private static class Consumer extends Thread{
		int cid = 1;
		
		public Consumer(int cid) {
			this.cid = cid;
		}

		@Override
		public void run() {
			while(true){
				//ģ������ʱ��
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				synchronized (hotDogs) {
					if(hotDogs.size()>0){
						System.out.println("������"+this.cid+"��������һ���ȹ�������Ϊ��"+hotDogs.remove(0));
						hotDogs.notifyAll();
					}else{
						try {
							System.out.println("�Ѿ�û���ȹ��ˣ��ȴ�������");
							hotDogs.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}
	

}
