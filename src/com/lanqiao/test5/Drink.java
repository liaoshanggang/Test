package com.lanqiao.test5;
/*1、建立一个Java抽象类Drink，应当：
a、声明一个抽象方法taste()，该方法负责输出饮料的味道；
b、声明int型常量来代表不同的饮料类型（咖啡、啤酒、牛奶），如：
c、声明静态工厂方法getDrink(int drinkType)，根据传入的参数创建不同的饮料对象，并返回该对象，建议使用switch语句。该方法要求声明DrinkNotFoundException，当没有相对应的饮料类型时，抛出该异常。
2、建立Drink的具体子类：
a、分别建立Drink的子类：Coffee（代表咖啡），Beer（代表啤酒），Milk（代表牛奶）;
b、实现taste()方法，要求在控制台打印各自的味道特征。

*/
public abstract class Drink {
	final int[] drinkType = new int[]{1,2,3};//依次代表咖啡、啤酒、牛奶
	
	public abstract void taste();
	
	static Drink getDrink(int drinkType) throws DrinkNotFoundException {
		Drink d=null;
			switch(drinkType){
			case 1:
				d = new Coffee();
				break;
			case 2:
				d = new Beer();
				break;
			case 3:
				d = new Milk();
				break;
			default:
				throw new DrinkNotFoundException();
			}
		return d;
		
		
	}
}
