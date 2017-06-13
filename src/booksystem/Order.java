package booksystem;

//������
public class Order {
	private int orderId;//������
	private double total;//�����ܶ�
	private String date;//��������
	private OrderItem[] items;//�������б�
	
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
