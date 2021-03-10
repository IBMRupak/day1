
public class Address {
	private String StreetName;
	private String CityName;
	private String State;
	private long Pincode;

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getPincode() {
		return Pincode;
	}

	public void setPincode(long pincode) {
		Pincode = pincode;
	}

	public Address(String streetName, String cityName, String state, long pincode) {
		super();
		StreetName = streetName;
		CityName = cityName;
		State = state;
		Pincode = pincode;
	}

}
