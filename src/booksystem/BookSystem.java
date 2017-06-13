package booksystem;
import java.util.Scanner;

public class BookSystem {
//	static int userSel;
	static Scanner in;
	static Book[] books;
	static OrderItem[] orderitem;
	
	static{
		books = new Book[3];
		books[0] = new Book(1, "java�̳�", 30.6, 66);
		books[1] = new Book(2, "JSPָ��", 42.1, 40);
		books[2] = new Book(3, "SSH�ܹ�", 47.3, 15);
	}
	
	public BookSystem() {
		
	}
	public static void mainMenuOper() {
		showMainMenu();
		in = new Scanner(System.in);
		System.out.println("��������������ѡ�����ҵ��");
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
			System.out.println("�˳�ϵͳ�ɹ���");
			System.exit(0);
			System.out.println("t");
			break;
		}
	}
	private static void showMainMenu(){
		System.out.println("----------ͼ�鶩��ϵͳ-----------");
		System.out.println("1�����ͼ��");
		System.out.println("2���黹ͼ��");
		System.out.println("3��ɾ��ͼ��");
		System.out.println("4������ͼ��");
		System.out.println("5���۸�����");
		System.out.println("6������ͼ��");
		System.out.println("0���˳�ϵͳ");
	}

	private static void buyBookMenuOper() {
		// TODO �Զ����ɵķ������
		
		while(true){
			System.out.println("��ӭ����ͼ�鹺�����");
			showBuyBookMenu();
			System.out.println("������ѡ��Ĳ�����");
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
		// TODO �Զ����ɵķ������
		int total1 = 0;//��¼����������
		int total2 = 0;
		int total3 = 0;
		orderitem = new OrderItem[3];

		while(true){
			System.out.println("������ͼ����ѡ��ͼ�飺");
			int orderbkid = in.nextInt();
			System.out.println("�����빺��ͼ��������");
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
			System.out.println("��������ͼ��(����1��ʾ������0��ʾ�˳�)��");
			int userSel = in.nextInt();
			if(userSel==0){
				buyBookMenuOper();
				break;
			}
		}
	}
	private static void showBuyBookMenu(){
		System.out.println("0������������");
		System.out.println("1���鿴ͼ��");
		System.out.println("2������ͼ��");
	}
	private static void rankByPrice() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ��");
	}

	private static void updateBook() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ��");
	}

	private static void deleteBook() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ��");

	}

	private static void returnBook() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ��");

	}

	 static void borrowBook() {
		// TODO �Զ����ɵķ������
		System.out.println("��ģ��δʵ��");
		
	}

	// ��ʾ����ͼ����Ϣ
	public static void showBook() {
		/*books = new Book[3];
		books[0] = new Book(1, "java�̳�", 30.6, 66);
		books[1] = new Book(2, "JSPָ��", 42.1, 40);
		books[2] = new Book(3, "SSH�ܹ�", 47.3, 15);*/
		System.out.println("================ͼ���б�================");
		System.out.println("ͼ����" + "\t" + "ͼ������" + "\t\t" + "ͼ�鵥��" + "\t"
				+ "�������");
		System.out.println("--------------------------------------");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getBookId() + "\t"
					+ books[i].getBookName() + "\t\t" + books[i].getPrice()
					+ "\t" + books[i].getStorage());
		}
		System.out.println("--------------------------------------");
	}
}
