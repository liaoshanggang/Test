package com.lanqiao.test5;
/*1������һ��Java������Drink��Ӧ����
a������һ�����󷽷�taste()���÷�������������ϵ�ζ����
b������int�ͳ���������ͬ���������ͣ����ȡ�ơ�ơ�ţ�̣����磺
c��������̬��������getDrink(int drinkType)�����ݴ���Ĳ���������ͬ�����϶��󣬲����ظö��󣬽���ʹ��switch��䡣�÷���Ҫ������DrinkNotFoundException����û�����Ӧ����������ʱ���׳����쳣��
2������Drink�ľ������ࣺ
a���ֱ���Drink�����ࣺCoffee�������ȣ���Beer������ơ�ƣ���Milk������ţ�̣�;
b��ʵ��taste()������Ҫ���ڿ���̨��ӡ���Ե�ζ��������

*/
public abstract class Drink {
	final int[] drinkType = new int[]{1,2,3};//���δ����ȡ�ơ�ơ�ţ��
	
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
