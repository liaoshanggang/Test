package com.lanqiao.test4;
// 4.��main()����������Manager��Employee����,��������Щ����ķ���
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("����",50,'��',10000.0);
		Employee e = new Employee("��һ", 25, '��', 5000.0);
		m.play();
		m.sing();
		e.play();
		e.sing();
	}
}
