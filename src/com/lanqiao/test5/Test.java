package com.lanqiao.test5;

/*4������Test�����࣬�����������ݵ���ȷ��
 a����дmain������ͨ�������д��εķ�ʽ����ĳ�����ϵ����͡�
 b����main�����У�����Drink���getDrink�����������Ӧ�����϶���ע�Ⲷ��DrinkNotFoundException��
 c��Ȼ����ø����϶����taste()��������������ϵ�ζ����*/
public class Test {
	public static void main(String[] args) {
		Drink d;
		if (args.length == 0) // û����������������������
			System.out.println("����������������");
		else {// ���������������
			System.out.println("���������������Ϊ�� ");
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
