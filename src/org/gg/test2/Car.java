package org.gg.test2;

class Car//��
/*Car���������������*/
{
	String color = "red";
	int num = 4;
	static boolean hasWheel = true;
	static String str = "��̬��Ա����";
	void show()
	{
		//this.show();//java.lang.StackOverflowError
		System.out.println("color="+color+"..num="+num);
	}
	static void method(){
		System.out.println("��̬��Ա����");
	}
	static void  notice(){
//		this.color;//����
		//��̬����ֻ�ܷ��ʾ�̬��Ա(��Ա�����ͳ�Ա����)
		method();
		str = "���ʾ�̬��Ա����";
		
	}

}
class CarDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();//��������
		c.color = "black";//�Զ�������Խ����޸�
		c.show();//ʹ�ö���Ĺ��ܡ�
//		�������������ʹ�÷���
		//1�����Զ���ķ���������һ�ε���ʱ
		new Car().show();
		//2������������Զ�ʵ�ʲ������д���
		show(new Car());
		Car c1 = new Car();
		Car c2 = new Car();
		//��������
		Car.hasWheel = false;
		//�����ж���������
		c1.hasWheel = true;
		c2.hasWheel = false;
		System.out.println("args:"+args);
		
	}
	public static void show(Car car){
		car.color = "blue";
		System.out.println("car.color:"+car.color);
	}
}