
public class Order extends Customer {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Order orders = new Order(110 + i);
		}
	}

	public Order(int OrderID) {
		this.OrderID = OrderID;
	}

	private int OrderID;
	private String Address;
	private String Item;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

}
