package jingsai;

public class Car {
	int whiles;//轮子数
	String color;//颜色
	int weight;//重量
	static int speed;//速度
	public Car(){
		
	}
	//初始化车
	public Car(int whiles, String color, int weight,int speed) {
		super();
		this.whiles = whiles;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	//减速
	public void downSpeed(){
		speed -= 10;
		System.out.println("正在减速。。。。。。。。。。");//操作提示
	}
	//加速
	public void upSpeed(){
		speed += 10;
		System.out.println("正在加速。。。。。。。。。。");//操作提示
	}
	//停止
	public void stop(){
		speed = 0;
		System.out.println("汽车已停止运行。。。。。。。。。。");//操作提示
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
