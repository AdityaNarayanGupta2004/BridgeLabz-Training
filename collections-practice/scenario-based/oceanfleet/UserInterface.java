package oceanfleet;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vessels to be added");
		int number = sc.nextInt();
		sc.nextLine();
		VesselUtil vesselUtil = new VesselUtil();
		
		
		System.out.println("Enter a Vessel details");
		for(int i = 0; i < number; i++) {
//			System.out.println("Enter a String");
			String input= sc.nextLine();
			String detail[] = input.split(":");
			
			String vesselID = detail[0];
			String vesselName = detail[1];
			double averageSpeed = Double.parseDouble(detail[2]);
			String vesselType = detail[3];
			Vessel vessel = new Vessel(vesselID,vesselName,averageSpeed, vesselType);
			
			vesselUtil.addVesselPerformance(vessel); // adding a detail in vessel
		}
			
			System.out.println("Enter the Vessel Id to check speed: "); // taking input of vessel id to check speed
			String vesselId = sc.next();
			
			Vessel foundVesselById = vesselUtil.getVesselById(vesselId); // calling a method
			
			if(foundVesselById == null) {
				System.out.println("Vessel Id "+ vesselId + " not found");
			}else {
				System.out.println(foundVesselById.getvesselId()+" | "+foundVesselById.getvesselName()+" | "+foundVesselById.getvesselType()+" | " + foundVesselById.getaverageSpeed()+" Knots");
			}
			
			List<Vessel> highPerformanceVessel = vesselUtil.getHighPerformanceVessels(); 
			System.out.println("High performance vessels are: ");
			
			// to print a highperformance vessel
			for(int idx = 0; idx < highPerformanceVessel.size(); idx++) {
				Vessel vessel1 = highPerformanceVessel.get(idx);
				System.out.println(vessel1.getvesselId()+" | "+ vessel1.getvesselName()+" | "+
						vessel1.getvesselType()+" | "+ vessel1.getaverageSpeed()+" knots");
//			}
			
		}
	}
}
