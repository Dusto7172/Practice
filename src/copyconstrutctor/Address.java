package copyconstrutctor;

public class Address {

	String city;
	int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}

}
