package booksystem;
//图书类
public class Book {
	private int bookId;// 图书编号
	private String bookName;// 图书名称
	private double price;// 图书单价
	private int storage;// 库存数量

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
