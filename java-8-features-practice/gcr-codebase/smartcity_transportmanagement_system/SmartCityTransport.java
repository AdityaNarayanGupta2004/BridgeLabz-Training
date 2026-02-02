package smartcity_transportmanagement_system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

interface TansportService{
	void printServiceDetails();
}

interface Geoutils{
	double calculateDistance();
}

class BusService implements TransportService{
	private LocalDateTime dateandTime;
	String departureTime;
	double price;
	
	public BusService(LocalDateTime dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public LocalDateTime getdateTime() {
		return dateandTime;
	}
	public String getdepartureTime() {
		return departureTime;
	}
	
	public void printServiceDetails() {
		System.out.println("Bus Service detail:");
		System.out.println("departureTime : "+ departureTime);
		System.out.println("Price: "+ price);
	}
}

class MetroService implements TransportService{
	private LocalDateTime dateandTime;
	String departureTime;
	double price;
	
	public MetroService(LocalDateTime dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public LocalDateTime getdateTime() {
		return dateandTime;
	}
	public String getdepartureTime() {
		return departureTime;
	}
	public void printServiceDetails() {
		System.out.println("Bus Service detail:");
		System.out.println("departureTime : "+ departureTime);
		System.out.println("Price: "+ price);
	}
}

class TaxiService implements TransportService{
	private LocalDateTime dateandTime;
	String departureTime;
	double price;
	
	public TaxiService(LocalDateTime dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public LocalDateTime getdateTime() {
		return dateandTime;
	}
	public String getdepartureTime() {
		return departureTime;
	}
	
	public void printServiceDetails() {
		System.out.println("Bus Service detail:");
		System.out.println("departureTime : "+ departureTime);
		System.out.println("Price: "+ price);
	}
}

public class SmartCityTransport {
	public static void main(String[] args) {
		List<BusService> bus = new ArrayList<>();
		List<MetroService> metro = new ArrayList<>();
		List<TaxiService> taxi = new ArrayList<>();
		
		  bus.add(new BusService(LocalDateTime.now(), "08:00 AM", 20.0));
	      bus.add(new BusService(LocalDateTime.now(), "10:00 AM", 25.0));
	        
	}
	
	public static void filter(List<BusService> bus,List<MetroService> metro, List<TaxiService> taxi, String ){
		
	}
}
