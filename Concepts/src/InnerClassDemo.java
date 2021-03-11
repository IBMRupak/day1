
public class InnerClassDemo {
	public static void main(String[] args) {
		Account[] accounts= new Account[10];
		
	}

}
class Account
{
	// private Address address;
	private Address[] addresses;
	private int number;
	public Account()
	{
		this.addresses = new Address[3];
	}
	
	public Address[] getAddress() {
		return addresses;
	}

	public void setAddress(Address[] address) {
		this.addresses = addresses;
	}

	class Address
	{
		private String Streetname;
	}
}
