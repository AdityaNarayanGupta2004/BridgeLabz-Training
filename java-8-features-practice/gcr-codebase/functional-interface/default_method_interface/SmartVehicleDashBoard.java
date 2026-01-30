package Functional_Interface.default_method_interface;

interface Vehicle {

	  void displaySpeed();

	  default void displayBattery() {
	        System.out.println("Battery info not available for this vehicle.");
	    }
	}

class Car implements Vehicle {
	 @Override
	 public void displaySpeed() {
	     System.out.println("Car speed: 80 km/h");
	 }
}

class ElectricCar implements Vehicle {
	@Override
	public void displaySpeed() {
	    System.out.println("Electric Car speed: 90 km/h");
	}
	@Override
	public void displayBattery() {
	    System.out.println("Electric Car battery: 75%");
	}
}

public class SmartVehicleDashBoard {
	public static void main(String[] args) {

		Vehicle myCar = new Car();
	    Vehicle myEV = new ElectricCar();

	    System.out.println("=== Gasoline Car ===");
	    myCar.displaySpeed();
	    myCar.displayBattery();

	    System.out.println("\n=== Electric Car ===");
	    myEV.displaySpeed();
	    myEV.displayBattery();
	}
}
