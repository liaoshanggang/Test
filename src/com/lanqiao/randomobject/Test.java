package com.lanqiao.randomobject;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		//定义一个数组
		Pet[] pets = new Pet[4];
		//0、代表狗	1、代表企鹅	2、代表家猫		3、代表野猫
		for (int i = 0; i < pets.length; i++) {//i=1
			Random random = new Random();
			int index = -1;
			
			//判断下标随机数不重复
			while(true){
				index =random.nextInt(4);//index = 3
				if(pets[index]==null){
					break;
				}
			}
			
			//赋值
			switch (index) {
			case 0:
				pets[index] = new Dog();//狗
				break;
			case 1:
				pets[index] = new Panguin();//企鹅
				break;
			case 2:
				pets[index] = new JCat();//家猫
				break;
			case 3:
				pets[index] = new YCat();//野猫
				break;
			}
			
		}
	}
}
