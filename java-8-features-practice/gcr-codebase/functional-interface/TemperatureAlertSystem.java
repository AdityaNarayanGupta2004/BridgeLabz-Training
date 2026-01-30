package Functional_Interface;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		double threshhold = 30.0;
		Predicate<Double> isOverheated = temp -> temp> threshhold;
		double reading[] = {25.5, 20.0, 56.0,28.2};
		for(double temp: reading) {
			if(isOverheated.test(temp)) {
				System.out.println("Alert: Temperature "+ temp +"C exceeds threshold of " + threshhold + "°C! ");
			}else {
				System.out.println("Temperature " + temp + "°C is safe.");
			}
		}
	}
}
