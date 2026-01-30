package Functional_Interface;

interface SmartDevice{
	void turnOn();
	void turnOff();
}

class Lights implements SmartDevice{
	public void turnOn() {
		System.out.println("Turn ON the light");
	}
	public void turnOff() {
		System.out.println("Turn OFF the light");
	}
}

class AC implements SmartDevice{
	public void turnOn() {
		System.out.println("Turn ON the AC");
	}
	public void turnOff() {
		System.out.println("Turn OFf the AC");
	}
}

class TV implements SmartDevice{
	public void turnOn() {
		System.out.println("Turn ON the TV");
	}
	public void turnOff() {
		System.out.println("Turn Off the TV");
	}
	
}

public class SmartDeviceControlInterface {
	public static void main(String[] args) {
		 SmartDevice light = new Lights();
	     SmartDevice ac = new AC();
	     SmartDevice tv = new TV();

         light.turnOn();
	     ac.turnOn();
	     tv.turnOn();
	     tv.turnOff();
	     light.turnOff();
	     ac.turnOff();
	}
}
