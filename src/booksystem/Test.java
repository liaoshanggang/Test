package booksystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//������
public class Test {
	static Scanner in;
	static Book[] books;
	static OrderItem[] orderitem;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		// �������� ���3�����͵�ͼ����Ϣ
		books = new Book[3];
		books[0] = new Book(1, "java�̳�", 30.6, 66);
		books[1] = new Book(2, "JSPָ��", 42.1, 40);
		books[2] = new Book(3, "SSH�ܹ�", 47.3, 15);

		// A����ȡ����ͼ����Ϣ�����
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

		// B���˿͹���ͼ�飺�˿�ͨ������ͼ����������ͼ�飬�����빺��������
		int total1 = 0;// ��¼��Ӧ�����������
		int total2 = 0;
		int total3 = 0;
		orderitem = new OrderItem[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("������ͼ����ѡ��ͼ�飺��ֻ����1��2��3��");
			int orderbkid = in.nextInt();
			System.out.println("�����빺��ͼ��������");
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
			System.out.println("��������ͼ��");
		}
		
		//C�����������Ϣ�����������š�������ϸ�������ܶ�������ڡ�
		System.out.println("================ͼ�鶩��================");

		double sumPrice = 0;//�����ܶ�
		for (int i = 0; i < books.length; i++) {
			if (orderitem[i]==null) {//�������ֻѡͬһ�����͵����
				orderitem[i] = new OrderItem(books[i].getBookName());	
			} else {
				sumPrice = sumPrice + orderitem[i].getNum() * orderitem[i].getPrice();
			}
		}
		
		//��������
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(
				"EE MM dd HH:mm:ss zzz yyyy");
		String date = sdf.format(d);
		Order order = new Order(00001, sumPrice, date, orderitem);
		
		System.out.println("ͼ�鶩���ţ�" + order.getOrderId());
		System.out.println("ͼ������\t\t��������\t\tͼ�鵥��");
		System.out.println("--------------------------------------");
		for (int j = 0; j < orderitem.length; j++) {
			System.out.println(orderitem[j].getBookName() + "\t\t"
					+ orderitem[j].getNum() + "\t\t" + orderitem[j].getPrice());
		}
		System.out.println("--------------------------------------");
		System.out.println("�����ܶ\t\t\t" + order.getTotal() + "\n���ڣ�"
				+ order.getDate());
		
	}
}
