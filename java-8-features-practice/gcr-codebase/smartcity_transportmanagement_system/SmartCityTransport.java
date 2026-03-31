package smartcity_transportmanagement_system;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

interface TransportService{
	String getDepartureTime();
    double getPrice();
    String getServiceType();
    
    default void printServiceDetails() {
        System.out.println(getServiceType()+" Departure Time: " + getDepartureTime());
        System.out.println(getServiceType()+" Price: " + getPrice());
    }
}

// static 
interface Geoutils{
	static double calculateDistance(double km) {
		return km*1.0;
	}
}

@FunctionalInterface
interface FareCalculator {
    double calculateFare(double distance);
}

//Marker Interface
interface EmergencyService{
	
}

class BusService implements TransportService{
	private String dateandTime;
	private String departureTime;
	private double price;
	
	public BusService(String dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public String getdateTime() {
		return dateandTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String getServiceType() {
		return "Bus";
	}
}

class MetroService implements TransportService{
	private String dateandTime;
	private String departureTime;
	private double price;
	
	public MetroService(String dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public String getdateTime() {
		return dateandTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	
    public double getPrice() {
    	return price;
	}

	@Override
	public String getServiceType() {
		return "Metro";
	}
}

class TaxiService implements TransportService, EmergencyService{
	private String dateandTime;
	private String departureTime;
	private double price;
	
	public TaxiService(String dateandTime, String departureTime, double price) {
		this.dateandTime  = dateandTime ;
		this.departureTime = departureTime;
		this.price = price;
	}
	
	// Getter Method
	public String getdateTime() {
		return dateandTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}

	public double getPrice() {
	   return price;
	}
	

	@Override
	public String getServiceType() {
		return "Taxi";
	}
}

class Passenger {
    String route;
    double fare;
    boolean peak;

    Passenger(String route, double fare, boolean peak) {
        this.route = route;
        this.fare = fare;
        this.peak = peak;
    }

    public String getRoute() { 
    	return route; 
    	}
    public double getFare() {
    	return fare; 
    	}
    public boolean isPeak() {
    	return peak; 
    }
}


public class SmartCityTransport {
	public static void main(String[] args) {
		List<TransportService> allServices = new ArrayList<>();
		allServices.add(new BusService("2/2/2026", "08:00 AM", 0));
		allServices.add(new MetroService("1/2/2026", "09:00 AM", 15));
		allServices.add(new TaxiService("31/01/2026", "08:30 AM", 30));
		
		System.out.println("All Services are: ");
		allServices.forEach(TransportService::printServiceDetails);

        System.out.println("\n=== FILTERED (Price <= 20) ===");
        allServices.stream()
                .filter(s -> s.getPrice() <= 20)
                .forEach(TransportService::printServiceDetails);
        
        FareCalculator fareCalculator = d -> d * 10;
        System.out.println("\nFare for 5km: " +
                fareCalculator.calculateFare(
                        Geoutils.calculateDistance(5)));
        
        System.out.println("\n EMERGENCY SERVICES");
        allServices.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);

        //Collectors 
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Route-A", 20, true),
                new Passenger("Route-A", 15, false),
                new Passenger("Route-B", 30, true),
                new Passenger("Route-B", 25, false)
        );
        
        System.out.println("\nPASSENGERS BY ROUTE");
        passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute))
                .forEach((r, p) -> System.out.println(r + " : " + p.size()));

        DoubleSummaryStatistics stats =
                passengers.stream()
                        .collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("\nTotal Fare: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());
	}
}

