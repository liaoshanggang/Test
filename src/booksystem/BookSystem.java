package booksystem;
import java.util.Scanner;

public class BookSystem {
//	static int userSel;
	static Scanner in;
	static Book[] books;
	static OrderItem[] orderitem;
	
	static{
		books = new Book[3];
		books[0] = new Book(1, "java教程", 30.6, 66);
		books[1] = new Book(2, "JSP指南", 42.1, 40);
		books[2] = new Book(3, "SSH架构", 47.3, 15);
	}
	
	public BookSystem() {
		
	}
	public static void mainMenuOper() {
		showMainMenu();
		in = new Scanner(System.in);
		System.out.println("请输入上面的序号选择你的业务：");
		int userSel = in.nextInt();
		switch (userSel) {
		case 1:
			borrowBook();
			break;
		case 2:
			returnBook();
			break;
		case 3:
			deleteBook();
			break;
		case 4:
			updateBook();
			break;
		case 5:
			rankByPrice();
			break;
		case 6:
			buyBookMenuOper();
			break;
		case 0:
			System.out.println("退出系统成功！");
			System.exit(0);
			System.out.println("t");
			break;
		}
	}
	private static void showMainMenu(){
		System.out.println("----------图书订购系统-----------");
		System.out.println("1、借出图书");
		System.out.println("2、归还图书");
		System.out.println("3、删除图书");
		System.out.println("4、更改图书");
		System.out.println("5、价格排名");
		System.out.println("6、订购图书");
		System.out.println("0、退出系统");
	}

	private static void buyBookMenuOper() {
		// TODO 自动生成的方法存根
		
		while(true){
			System.out.println("欢迎进入图书购买界面");
			showBuyBookMenu();
			System.out.println("请输入选择的操作：");
			int userSel = in.nextInt();
			switch(userSel){
			case 1:
				showBook();
				break;
			case 2:
				buyBook();
				break;
			}
			if(userSel==0){
				mainMenuOper();
				break;
			}
		}
		
	}
	private static void buyBook() {
		// TODO 自动生成的方法存根
		int total1 = 0;//记录购书总数量
		int total2 = 0;
		int total3 = 0;
		orderitem = new OrderItem[3];

		while(true){
			System.out.println("请输入图书编号选择图书：");
			int orderbkid = in.nextInt();
			System.out.println("请输入购买图书数量：");
			int orderNum = in.nextInt();
			
			switch(orderbkid){
			case 1:
				total1 += orderNum;
				orderitem[1] = new OrderItem(books[1].getBookName(), books[1].getPrice(), total1);
				break;
			case 2:
				total1 += orderNum;
				orderitem[2] = new OrderItem(books[2].getBookName(), books[2].getPrice(), total2);
				break;
			case 3:
				total1 += orderNum;
				orderitem[3] = new OrderItem(books[3].getBookName(), books[3].getPrice(), total3);
				break;
			}
			System.out.println("继续购买图书(输入1表示继续，0表示退出)：");
			int userSel = in.nextInt();
			if(userSel==0){
				buyBookMenuOper();
				break;
			}
		}
	}
	private static void showBuyBookMenu(){
		System.out.println("0、返回主界面");
		System.out.println("1、查看图书");
		System.out.println("2、订购图书");
	}
	private static void rankByPrice() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现");
	}

	private static void updateBook() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现");
	}

	private static void deleteBook() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现");

	}

	private static void returnBook() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现");

	}

	 static void borrowBook() {
		// TODO 自动生成的方法存根
		System.out.println("该模块未实现");
		
	}

	// 显示所有图书信息
	public static void showBook() {
		/*books = new Book[3];
		books[0] = new Book(1, "java教程", 30.6, 66);
		books[1] = new Book(2, "JSP指南", 42.1, 40);
		books[2] = new Book(3, "SSH架构", 47.3, 15);*/
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
	}
}
