package demo1;
import java.util.*;

public class AeroVigil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Flight Details:");
		String flightDetails = sc.nextLine();
		
		String detail[] = flightDetails.split(":"); // splitting by : and storing value in String array
		// storing a value from string array 
		String flightNumber = detail[0]; 
		String flightName = detail[1];
		int PassengerCount = Integer.parseInt(detail[2]);
		int CurrentFuelLevel = Integer.parseInt(detail[3]);
		
//		System.out.println(flightNumber + flightName+PassengerCount+CurrentFuelLevel);
		try {
            if(validateFlightNumber(flightNumber)&& validateFlightName(flightName) &&
            		validatePassengerCount(PassengerCount, flightName)) {
            	System.out.println("Fuel required to fill the tank:"+ calculateFuelToFillTank(flightName, CurrentFuelLevel)+" liters");
            }
        } 
		catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
	}
	
	// method to validate flight Number
	public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		if(flightNumber == null || !flightNumber.matches("FL-[1-9][0-9]{3}")) {
			throw new InvalidFlightException("The flightNumber " + flightNumber +" is invalid");
		}
		return true;
	}
	
	// method to validate a flight name
	public static boolean validateFlightName(String flightName) throws InvalidFlightException{
		if(!flightName.equals("SpiceJet") && !flightName.equals("Vistara") && 
		   !flightName.equals("IndiGo")&& !flightName.equals("Air Arabia")) {
			throw new InvalidFlightException("The flightName " + flightName +" is invalid");
		}
		return true;
	}
	
	//method to validate passenger count
	public static boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		if(flightName.equals("SpiceJet") && passengerCount <= 396) {
			return true;
		}else if(flightName.equals("Vistara") && passengerCount <= 615){
			return true;
		}else if(flightName.equals("IndiGo") && passengerCount <= 230) {
			return true;
		}else if(flightName.equals("Air Arabia") && passengerCount <= 130) {
			return true;
		}
			throw new InvalidFlightException("The Passenger Count is " + passengerCount +" is invalid for "+ flightName);
	}
	
	// method to calculate a fuel to fill tank
	public static double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("SpiceJet", 200000);
		map.put("Vistara", 300000);
		map.put("IndiGo", 250000);
		map.put("Air Arabia", 150000);
		if((currentFuelLevel < 0) || (currentFuelLevel > map.get(flightName))) {
			throw new InvalidFlightException("Invalid Fuel level for " + flightName);
		}
		else {
			return map.get(flightName)-currentFuelLevel;
		}
	}
}
// Custom Exception
class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }
}
