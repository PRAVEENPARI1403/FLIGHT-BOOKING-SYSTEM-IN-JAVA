package FlightBookingSystem;

public class Passenger {
	private int id;
	private String name;
	private String contact;
	
	public Passenger(int id, String name, String contact) {
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	
	public int getid() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public static void main(String[] args) {
		
	}

}
