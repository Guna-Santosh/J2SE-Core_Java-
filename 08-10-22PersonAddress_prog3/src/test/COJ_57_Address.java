package test;

public class COJ_57_Address {
	private String doorNo;
	private String street;
	private String city;

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public COJ_57_Address() {
	}

	public COJ_57_Address(String doorNo, String street, String city) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "COJ_57_Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + "]";
	}
}
