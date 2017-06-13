package org.gg.test;


class Animal {
	void eat(){
		System.out.println("animal eatting.....");
	}
}
class Bird extends Animal{
	void eat(){
		System.out.println("bird eattting......");
	}
	void fly(){
		System.out.println("bird flying......");
	}
}
class Test{
	public static void main(String[] args) {
		//父类的引用指向子类对象
		Animal animal = new Bird();
		animal.eat();
//		animal.fly();//错误
	}
}



/*转型是在继承的基础上而言的，继承是面向对象语言中，代码复用的一种机制，通过继承，子类可以复用父类的功能，如果父类不能满足当前子类的需求，则子类可以重写父类中的方法来加以扩展。

向上转型：子类引用的对象转换为父类类型称为向上转型。通俗地说就是是将子类对象转为父类对象。此处父类对象可以是接口

向下转型：父类引用的对象转换为子类类型称为向下转型。

前者是一个向上转型，Animal dog 引用指向new Dog();子类对象当成父类对象，只能调用父类的成员，如果子类重写了父类的方法就根据这个引用指向调用子类重写的这个方法（这个方法就是覆盖override）。这个调用过程就称为“动态绑定”。

转型需要注意的问题：

向上转型时，父类指向子类引用对象会遗失除与父类对象共有的其他方法，也就是在转型过程中，子类的新有的方法都会遗失掉，在编译时，系统会提供找不到方法的错误。
*/