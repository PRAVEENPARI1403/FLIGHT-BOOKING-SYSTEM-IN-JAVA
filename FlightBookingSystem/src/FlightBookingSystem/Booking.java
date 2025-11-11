package FlightBookingSystem;

public class Booking {
	
	private Passenger passenger;
	private Flight flight;
	private String date;
	
	public Booking(Passenger passenger, Flight flight, String date) {
		this.passenger = passenger;
		this.flight = flight;
		this.date = date;
	}
	
	public void display() {
		System.out.println("passenger "+ passenger.getName() + passenger.getContact());
		System.out.println("flight "+ flight.getFlightNo() + flight.getDestination() + flight.getSource());
		System.out.println("date "+ date +"$." + flight.getPrice());
		System.out.println("_________________________________________________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
