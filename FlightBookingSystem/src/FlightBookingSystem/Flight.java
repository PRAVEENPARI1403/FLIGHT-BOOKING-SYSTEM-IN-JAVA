package FlightBookingSystem;

public class Flight {
	private String flightNo;
	private String source;
	private String destination;
	private Double price;
	
	public Flight(String flightNo, String source, String destination, double price) {
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	
	public String getFlightNo() {
		return flightNo;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public double getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		
	}

}
