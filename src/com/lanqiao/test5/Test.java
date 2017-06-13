package com.lanqiao.test5;

/*4、建立Test测试类，测试以上内容的正确性
 a、编写main方法，通过命令行传参的方式传入某种饮料的类型。
 b、在main方法中，调用Drink类的getDrink方法，获得相应的饮料对象。注意捕获DrinkNotFoundException。
 c、然后调用该饮料对象的taste()方法，输出该饮料的味道。*/
public class Test {
	public static void main(String[] args) {
		Drink d;
		if (args.length == 0) // 没有向命令行输入参数的情况
			System.out.println("请从命令行输入参数");
		else {// 向命令行输入参数
			System.out.println("向命令行输入参数为： ");
			for (int i = 0; i < args.length; i++)
				try {
					Drink.getDrink(Integer.parseInt(args[i])).taste();;
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DrinkNotFoundException e) {
				}
		}
	}
}
