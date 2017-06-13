package com.lanqiao.test3;
//再定义一个小汽车类Car，继承Auto，并添加空调（airCond）、CD等成员变量，覆盖加速、减速、信息输出
public class Car extends Auto{
	boolean isHasAirCond = true;
	boolean isHasCD = true;
	
	public void speedUp() {
		// TODO Auto-generated method stub
		super.speedUp();
	}

	public void speedDown() {
		// TODO Auto-generated method stub
		super.speedDown();
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "轮胎数："+tires+"颜色："+color+"车重："+weight+"吨"+"速度："+speed
				+"是否有空调："+isHasAirCond+"是否带CD:"+isHasCD;
	}
}
