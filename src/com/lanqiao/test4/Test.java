package com.lanqiao.test4;
// 4.在main()方法中制造Manager和Employee对象,并测试这些对象的方法
public class Test {
	public static void main(String[] args) {
		Manager m = new Manager("马云",50,'男',10000.0);
		Employee e = new Employee("万一", 25, '男', 5000.0);
		m.play();
		m.sing();
		e.play();
		e.sing();
	}
}
