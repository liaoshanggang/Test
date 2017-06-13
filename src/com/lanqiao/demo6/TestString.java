package com.lanqiao.demo6;
import java.util.Scanner;
public class TestString {
	/*1、输入一个字符串，判断这个字符串的长度如果小于6就输出“长度不够”，否则输出“正确”。
	2、输入一个用户名，与一个密码，判断这个用户名与密码是否都等于lanqiao，并不区分大小写。
	3、输入一个小写字符串，输出这个字符串的大写形式。
	4、输入一个字符串，格式如：我的名字叫：XXXX，要求使用字符串的方法提取出名字。*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		1、输入一个字符串，判断这个字符串的长度如果小于6就输出“长度不够”，否则输出“正确”。
		System.out.println("请输入一个字符串：");
		String str = in.next();
		if(str.length()<6){
			System.out.println("长度不够");
		}else{
			System.out.println("正确");
		}
//		2、输入一个用户名，与一个密码，判断这个用户名与密码是否都等于lanqiao，并不区分大小写。
		System.out.println("请输入一个用户名：");
		String name = in.next();
		System.out.println("请输入一个密码：");
		String pwd = in.next();
		if(name.equalsIgnoreCase("lanqiao")&&pwd.equalsIgnoreCase("lanqiao")){
			System.out.println("用户名与密码是否都等于lanqiao");
		}
//		3、输入一个小写字符串，输出这个字符串的大写形式。
		System.out.println("请输入一个小写的字符串：");
		String strc = in.next();
		strc.toUpperCase();
		System.out.println("这个字符串的大写形式为："+str);
//		4、输入一个字符串，格式如：我的名字叫：XXXX，要求使用字符串的方法提取出名字。
		System.out.println("请输入一个字符串：格式如：我的名字叫：XXXX");
		String str2 = in.next();
		String[] st = str2.split(":");
		System.out.println("提取出的名字为："+st[1]);
		
	}
}
