package com.lanqiao.test2;
/**
 * 2������һ����ʾѧ����Ϣ����Student��Ҫ�����£���50�֣�
 * ��1����Student�ĳ�Ա������
 * sNo��ʾѧ�ţ� sName��ʾ������ sSex��ʾ�Ա� sAge��ʾ���䣬 sJava ��ʾjava�γ̳ɼ���
 * ��2����Student�������Ĺ��췽����
 * �ڹ��췽����ͨ���β���ɶԳ�Ա�����ĸ�ֵ������
 * ��3����Student�ķ�����Ա��
 * getNo�����ѧ��
 * getName:�������
 * getSex:����Ա�
 * getAge:�������
 * @author Administrator
 *
 */
public class Student {
	int sNo;// ѧ��
	String sName;// ����
	char sSex;// �Ա�
	int sAge;// ����
	double sJava; // java�γ̳ɼ�

	public Student(int sNo, String sName, char sSex, int sAge, double sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	public int getsNo() {
		return sNo;
	}

	public String getsName() {
		return sName;
	}

	public char getsSex() {
		return sSex;
	}

	public int getsAge() {
		return sAge;
	}

	public double getsJava() {
		return sJava;
	}
}
