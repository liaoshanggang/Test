package booksystem;

//订单类
public class Order {
	private int orderId;//订单号
	private double total;//订单总额
	private String date;//订单日期
	private OrderItem[] items;//订单项列表
	
	public Order() {
	}

	public Order(int orderId, double total, String date, OrderItem[] items) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.date = date;
		this.items = items;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public OrderItem[] getItems() {
		return items;
	}

	public void setItems(OrderItem[] items) {
		this.items = items;
	}

	

}
