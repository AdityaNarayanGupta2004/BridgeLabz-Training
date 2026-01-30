package demo1;

import java.util.*;

public class FactoryRobotHazardAnalyzer {
	// main Method
	public static void main(String[] args) throws RobotSafetyException {
		Scanner sc = new Scanner(System.in);
		// Taking a Input from User
		System.out.println("Enter Arm Precision(0.0-1.0): ");
		double armPrecision = sc.nextDouble();
		
		System.out.println("Enter the Work Density(1-20): ");
		int workerDensity = sc.nextInt();
		
		System.out.println("Enter the machineryState(Worn/Faulty/Critical): ");
		String machineryState = sc.next();
		
		// Handling a Exception Given by the method
		try {
			double ans = CalculateHazardRisk(armPrecision, workerDensity, machineryState);
			if(ans >= 0) {
				System.out.println("Robot Hazard Risk Score: "+ ans); // Printing a Robot Hazard Risk Score
			}
			// Printing a Exception a message
		}catch(RobotSafetyException e){
			System.out.println(e.getMessage());
		}
	}
	
	// creating a method to calculate a HazardRisk AND to check whether a given input is valid or not
	public static double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{
		// Checking whether a ArmPrecision is valid or not
		if(armPrecision < 0.0 || armPrecision > 1.0) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		
		// Checking whether a WorkerDensity is valid or not
		if(workerDensity < 1 || workerDensity > 20) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		
		// Storing a hard value in a map
		HashMap<String,Double> map = new HashMap<>();
		map.put("Worn",1.3);
		map.put("Faulty", 2.0);
		map.put("Critical", 3.0);
		
		// Checking 
		if(!map.containsKey(machineryState)) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		
		double machineRiskFactor = map.get(machineryState);
		double HazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
		return HazardRisk;
		
	}
}

// Creating a Custom Exception
class RobotSafetyException extends Exception{
	RobotSafetyException(String message){
		super(message);
	}
}
