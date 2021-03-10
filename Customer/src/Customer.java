
public class Customer {

	private String CustomerName;
	private int CustomerID;

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String CustomerName) {
		if (CustomerName == null || CustomerName.trim().contentEquals("")) {
			throw new IllegalArgumentException("Name is mandatory");
		}

		this.CustomerName = CustomerName;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

}
