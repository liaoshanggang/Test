package com.lanqiao.inclass;
/*3.��д���򣺽������һ���ı��еĸ������ʵ���ĸ˳��ת��
��To be or not to be"�������"oT eb ro ton ot eb."

дһ�������ж�һ���ַ����Ƿ�Գƣ��硰asdfgfdsa����

дһ������ʵ����������
String s=��name=zhangsan age=18 classNo=090728��;
��������ַ�����֣��������:
zhangsan 18 090728*/

public class TestString {
	public static void main(String[] args) {
		sop(tran());
		sop(isSymmetrical());
		sop(split());
	}
	public static void sop(Object o){
		System.out.println(o);
	}
	public static StringBuffer split(){
		String s = "name=zhangsan age=18 classNo=090728";
		String[] str = s.split(" ");
		StringBuffer sbf = new StringBuffer();
		for(int i=0;i<str.length;i++){
			String[] str1 = str[i].split("=");
			sbf.append(str1[str1.length-1]+" ");
		}
		sbf.deleteCharAt(sbf.length()-1);
		return sbf;
	}
	public static boolean isSymmetrical(){
		String str = "asdfgfdsa";
		boolean flag = false;
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)==str.charAt(str.length()-i-1)){
				flag = true;
			}else{
				return false;
			}
		}
		return flag;
	}
	public static StringBuffer tran(){
		String aText = "To be or not to be";
		String[] str = aText.split(" ");
		StringBuffer sbf2 = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			StringBuffer sbf = new StringBuffer(str[i]);
			sbf.reverse();
			sbf2.append(sbf+" ");
		}
		sbf2.deleteCharAt(sbf2.length()-1);
		return sbf2;
		
	}
}
