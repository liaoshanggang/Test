package booksystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//测试类
public class Test {
	static Scanner in;
	static Book[] books;
	static OrderItem[] orderitem;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		// 定义数组 存放3种类型的图书信息
		books = new Book[3];
		books[0] = new Book(1, "java教程", 30.6, 66);
		books[1] = new Book(2, "JSP指南", 42.1, 40);
		books[2] = new Book(3, "SSH架构", 47.3, 15);

		// A、获取所有图书信息并输出
		System.out.println("================图书列表================");
		System.out.println("图书编号" + "\t" + "图书名称" + "\t\t" + "图书单价" + "\t"
				+ "库存数量");
		System.out.println("--------------------------------------");

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getBookId() + "\t"
					+ books[i].getBookName() + "\t\t" + books[i].getPrice()
					+ "\t" + books[i].getStorage());
		}
		System.out.println("--------------------------------------");

		// B、顾客购买图书：顾客通过输入图书编号来购买图书，并输入购买数量。
		int total1 = 0;// 记录对应购书的总数量
		int total2 = 0;
		int total3 = 0;
		orderitem = new OrderItem[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入图书编号选择图书：（只能输1，2，3）");
			int orderbkid = in.nextInt();
			System.out.println("请输入购买图书数量：");
			int orderNum = in.nextInt();

			switch (orderbkid) {
			case 1:
				total1 += orderNum;
				orderitem[0] = new OrderItem(books[0].getBookName(),
						books[0].getPrice(), total1);
				break;
			case 2:
				total2 += orderNum;
				orderitem[1] = new OrderItem(books[1].getBookName(),
						books[1].getPrice(), total2);
				break;
			case 3:
				total3 += orderNum;
				orderitem[2] = new OrderItem(books[2].getBookName(),
						books[2].getPrice(), total3);
				break;
			}
			System.out.println("继续购买图书");
		}
		
		//C、输出订单信息：包括订单号、订单明细、订单总额、订单日期。
		System.out.println("================图书订单================");

		double sumPrice = 0;//订单总额
		for (int i = 0; i < books.length; i++) {
			if (orderitem[i]==null) {//解决出现只选同一种类型的情况
				orderitem[i] = new OrderItem(books[i].getBookName());	
			} else {
				sumPrice = sumPrice + orderitem[i].getNum() * orderitem[i].getPrice();
			}
		}
		
		//订单日期
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(
				"EE MM dd HH:mm:ss zzz yyyy");
		String date = sdf.format(d);
		Order order = new Order(00001, sumPrice, date, orderitem);
		
		System.out.println("图书订单号：" + order.getOrderId());
		System.out.println("图书名称\t\t购买数量\t\t图书单价");
		System.out.println("--------------------------------------");
		for (int j = 0; j < orderitem.length; j++) {
			System.out.println(orderitem[j].getBookName() + "\t\t"
					+ orderitem[j].getNum() + "\t\t" + orderitem[j].getPrice());
		}
		System.out.println("--------------------------------------");
		System.out.println("订单总额：\t\t\t" + order.getTotal() + "\n日期："
				+ order.getDate());
		
	}
}
