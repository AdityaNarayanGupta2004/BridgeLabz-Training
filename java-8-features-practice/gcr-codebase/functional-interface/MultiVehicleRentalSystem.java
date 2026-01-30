package Functional_Interface;

interface Vehicle{
	void rent();
	void returnVehicle();
}

class Cars implements Vehicle{
	public void rent() {
		System.out.println("Car has been Rented");
	}
	public void returnVehicle(){
		System.out.println("Car has been Returned");
	}
}

class Bike implements Vehicle{
	public void rent() {
		System.out.println("Bike has been Rented");
	}
	public void returnVehicle(){
		System.out.println("Bike has been Returned");
	}
}

class Buses implements Vehicle{
	public void rent() {
		System.out.println("Bus has been Rented");
	}
	public void returnVehicle(){
		System.out.println("Bus has been Returned");
	}
}

public class MultiVehicleRentalSystem {
	public static void main(String[] args) {
		Vehicle car = new Cars();
		Vehicle bus = new Buses();
		Vehicle bike = new Bike();
		
		car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
		
	}
}
