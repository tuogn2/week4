package entity;

public class Address {
	private String street;

	public Address(String street) {
		super();
		this.street = street;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	}
	
}
