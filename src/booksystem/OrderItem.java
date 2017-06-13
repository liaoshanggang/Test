package booksystem;
//订单项类
public class OrderItem {
	private String bookName;//图书名称
	private double price;//图书单价
	private int num;//购买数量
	
	public OrderItem() {
	}
	
	//只有名称的订单项
	public OrderItem(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	public OrderItem(String bookName, double price, int num) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.num = num;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
