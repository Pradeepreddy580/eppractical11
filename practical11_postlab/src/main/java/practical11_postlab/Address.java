package practical11_postlab;

public class Address {
	private int dno;
	private String street;
	private String city;
	private String State;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
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
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Address(int dno, String street, String city, String state) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
		State = state;
	}
	
	public Address() {
		super();
		
	}
}
