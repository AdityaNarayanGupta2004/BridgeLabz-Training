package Functional_Interface.staticmethods_Interface;

public class UnitConversionTool {
	public static void main(String[] args) {
		double distanceKm = 10;
		double weight = 50;
		System.out.println(distanceKm +" Km is "+ UnitConvertor.kmToMiles(distanceKm)+" mile");
		System.out.println(weight +" Kg is "+ UnitConvertor.kgTolbs(weight)+" lbs ");
	}
	@FunctionalInterface
	public interface UnitConvertor{
		static double kmToMiles(double km) {
	        return km * 0.621371;
	    }
		static double kgTolbs(double kg) {
	        return kg * 2.20462;
	    }
		public void sayHello(); //one  Abstract method should be there in functional interface 
	}
}
