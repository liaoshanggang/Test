package booksystem;
//ͼ����
public class Book {
	private int bookId;// ͼ����
	private String bookName;// ͼ������
	private double price;// ͼ�鵥��
	private int storage;// �������

	public Book() {
	}

	public Book(int bookId, String bookName, double price, int storage) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.storage = storage;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

}
