package aggregation;

public class Address {
	private String city;
	private String state;
	private int pincode;
	
	//cost--para
	public Address(String city, String state, int pincode) {
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
		
	
	
	

}
