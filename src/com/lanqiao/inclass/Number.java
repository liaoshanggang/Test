package com.lanqiao.inclass;
/*��дJava����ģ��򵥵ļ�������  
������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С�
��д���췽��������n1��n2��ʼֵ����Ϊ���ඨ��ӣ�addition��������subtration����
�ˣ�multiplication��������division���ȹ��г�Ա������
�ֱ��������Ա����ִ�мӡ������ˡ��������㡣  
���½�һ��������Test����main�����д���Number��Ķ��󣬵��ø�������������ʾ��������
*/
public class Number {
	private int n1;
	private int n2;
	public Number(){
		
	}
	public Number(int n1,int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	//������
	int add(){
		return n1+n2;
	}
	int sub(){
		return n1-n2;
	}
	int mul(){
		return n1*n2;
	}
	int div(){
		return n1/n2;
	}
}
