package oceanfleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();
	
	public List<Vessel> getvesselList() {
		return vesselList;
	}
	
	public void setvesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	
	//Requirement 1: Add Vessel performance details to the List.
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
//	Requirement 2: Retrieve vessel detail by vesselId
	public Vessel getVesselById(String vesselId) {
		for(Vessel vessel : vesselList) {
			if(vessel.getvesselId().equalsIgnoreCase(vesselId)) {
				return vessel;
			}
		}
		return null;
	}
	
	
//	Requirement 3: Retrieve high performance vessels.
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> highPerformance = new ArrayList<Vessel>();
		double maxavgSpeed = Integer.MIN_VALUE;
		for(Vessel vessel: vesselList) {
			maxavgSpeed = Math.max(maxavgSpeed, vessel.getaverageSpeed());
		}
		
		for(Vessel vessel: vesselList) {
			if(vessel.getaverageSpeed() == maxavgSpeed) {
				highPerformance.add(vessel);
			}
		}
		return highPerformance;
	}
	
	
}
