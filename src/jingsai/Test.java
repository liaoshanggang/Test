package jingsai;
public class Test {
	public static void main(String[] args) {
		Car c = new Car(4,"��ɫ",20,200);
		//���������Ϣ
		System.out.println("�ó���̥��Ϊ��"+c.getWhiles()+" �ó���ɫΪ��"+c.getColor()
				+" �ó���Ϊ��"+c.getWeight()+" �ó��ٶ�Ϊ��"+c.getSpeed());
		//����5��
		for(int i=0;i<5;i++){
			System.out.println("�������ڼ��ٵ�"+i+"��");
			c.downSpeed();
			System.out.println("�ٶ�Ϊ��"+Car.getSpeed());
		}
		//����10��
		for(int i=0;i<10;i++){
			System.out.println("�������ڼ��ٵ�"+i+"��");
			c.upSpeed();
			System.out.println("�ٶ�Ϊ��"+Car.getSpeed());
		}
		c.stop();
		
	}
}
