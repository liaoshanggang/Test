package jingsai;

public class Car {
	int whiles;//������
	String color;//��ɫ
	int weight;//����
	static int speed;//�ٶ�
	public Car(){
		
	}
	//��ʼ����
	public Car(int whiles, String color, int weight,int speed) {
		super();
		this.whiles = whiles;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	//����
	public void downSpeed(){
		speed -= 10;
		System.out.println("���ڼ��١�������������������");//������ʾ
	}
	//����
	public void upSpeed(){
		speed += 10;
		System.out.println("���ڼ��١�������������������");//������ʾ
	}
	//ֹͣ
	public void stop(){
		speed = 0;
		System.out.println("������ֹͣ���С�������������������");//������ʾ
	}
	public int getWhiles() {
		return whiles;
	}
	public void setWhiles(int whiles) {
		this.whiles = whiles;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		Car.speed = speed;
	}
	
	
}
