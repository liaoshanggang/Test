package com.lanqiao.demo6;
import java.util.Scanner;
public class TestString {
	/*1������һ���ַ������ж�����ַ����ĳ������С��6����������Ȳ������������������ȷ����
	2������һ���û�������һ�����룬�ж�����û����������Ƿ񶼵���lanqiao���������ִ�Сд��
	3������һ��Сд�ַ������������ַ����Ĵ�д��ʽ��
	4������һ���ַ�������ʽ�磺�ҵ����ֽУ�XXXX��Ҫ��ʹ���ַ����ķ�����ȡ�����֡�*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		1������һ���ַ������ж�����ַ����ĳ������С��6����������Ȳ������������������ȷ����
		System.out.println("������һ���ַ�����");
		String str = in.next();
		if(str.length()<6){
			System.out.println("���Ȳ���");
		}else{
			System.out.println("��ȷ");
		}
//		2������һ���û�������һ�����룬�ж�����û����������Ƿ񶼵���lanqiao���������ִ�Сд��
		System.out.println("������һ���û�����");
		String name = in.next();
		System.out.println("������һ�����룺");
		String pwd = in.next();
		if(name.equalsIgnoreCase("lanqiao")&&pwd.equalsIgnoreCase("lanqiao")){
			System.out.println("�û����������Ƿ񶼵���lanqiao");
		}
//		3������һ��Сд�ַ������������ַ����Ĵ�д��ʽ��
		System.out.println("������һ��Сд���ַ�����");
		String strc = in.next();
		strc.toUpperCase();
		System.out.println("����ַ����Ĵ�д��ʽΪ��"+str);
//		4������һ���ַ�������ʽ�磺�ҵ����ֽУ�XXXX��Ҫ��ʹ���ַ����ķ�����ȡ�����֡�
		System.out.println("������һ���ַ�������ʽ�磺�ҵ����ֽУ�XXXX");
		String str2 = in.next();
		String[] st = str2.split(":");
		System.out.println("��ȡ��������Ϊ��"+st[1]);
		
	}
}
