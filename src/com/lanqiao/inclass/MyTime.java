package com.lanqiao.inclass;
/*�ڳ����У�����Ҫ��ʱ����в��������ǲ�û��ʱ�����͵����ݡ���ô�����ǿ����Լ�ʵ��һ��ʱ���࣬����������е���Ҫ�� 
������ΪMyTime���࣬
����Ӧ���������ͳ�Ա��ʱ��hour�����֣�minute�����루second����Ϊ�˱�֤���ݵİ�ȫ�ԣ�
��������Ա����Ӧ����Ϊ˽��private�� 
ΪMyTime�ඨ�幹�췽�����Է��㴴������ʱ��ʼ����Ա������ 
�ٶ���diaplay���������ڽ�ʱ����Ϣ��ӡ�������Լ�����һ��test����������У��ʱ���Ƿ���ȷ��
ΪMyTime��������·������ֱ��ʱ���֡�����мӺͼ����㣺 
addSecond(int sec) 
addMinute(int min) 
addHour(int hou) 
subSecond(int sec) 
subMinute(int min) 
subHour(int hou) */

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
		// TODO �Զ����ɵĹ��캯�����
	}
	//��������ʱ��ʼ����Ա������ 
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//��ʱ����Ϣ��ӡ����
	public void display(){
		System.out.println("��ǰʱ��Ϊ��"+this.hour+"ʱ"+this.minute+"��"+this.second+"��");
	}
	//����У��ʱ���Ƿ���ȷ��
	public void test(){
		
	}
	public void addSecond(int sec){
		
	}
	public void addMinute(int min){
		
	}
	public void addHour(int hour){
		
	}
	public void subSecond(int sec){
		
	}
	public void subMinute(int min){
		
	}
	public void subHour(int hou){
		
	}
}
