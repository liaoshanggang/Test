package com.lanqiao.test3;
//�ٶ���һ��С������Car���̳�Auto������ӿյ���airCond����CD�ȳ�Ա���������Ǽ��١����١���Ϣ���
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
		return "��̥����"+tires+"��ɫ��"+color+"���أ�"+weight+"��"+"�ٶȣ�"+speed
				+"�Ƿ��пյ���"+isHasAirCond+"�Ƿ��CD:"+isHasCD;
	}
}
