package jingsai;
public class Test {
	public static void main(String[] args) {
		Car c = new Car(4,"红色",20,200);
		//输出车的信息
		System.out.println("该车轮胎数为："+c.getWhiles()+" 该车颜色为："+c.getColor()
				+" 该车重为："+c.getWeight()+" 该车速度为："+c.getSpeed());
		//减速5次
		for(int i=0;i<5;i++){
			System.out.println("汽车正在减速第"+i+"次");
			c.downSpeed();
			System.out.println("速度为："+Car.getSpeed());
		}
		//加速10次
		for(int i=0;i<10;i++){
			System.out.println("汽车正在加速第"+i+"次");
			c.upSpeed();
			System.out.println("速度为："+Car.getSpeed());
		}
		c.stop();
		
	}
}
