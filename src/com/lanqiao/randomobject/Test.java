package com.lanqiao.randomobject;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		//����һ������
		Pet[] pets = new Pet[4];
		//0������	1���������	2�������è		3������Ұè
		for (int i = 0; i < pets.length; i++) {//i=1
			Random random = new Random();
			int index = -1;
			
			//�ж��±���������ظ�
			while(true){
				index =random.nextInt(4);//index = 3
				if(pets[index]==null){
					break;
				}
			}
			
			//��ֵ
			switch (index) {
			case 0:
				pets[index] = new Dog();//��
				break;
			case 1:
				pets[index] = new Panguin();//���
				break;
			case 2:
				pets[index] = new JCat();//��è
				break;
			case 3:
				pets[index] = new YCat();//Ұè
				break;
			}
			
		}
	}
}
