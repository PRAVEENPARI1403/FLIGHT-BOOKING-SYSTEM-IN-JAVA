package FlightBookingSystem;

public class Admin extends User {
	public Admin (String name) {
		super(name);
	}
	
	@Override
	public void showMenu() {
		System.out.println("wellcome "+ name+" - Flight Booking System");
		System.out.println("1. Register Passenger");
		System.out.println("2. View Flight");
		System.out.println("3. Book Flight");
		System.out.println("4. View Bookings");
		System.out.println("5. Search Flight");
		System.out.println("Exit");
		
	}

}
