package oceanfleet;

public class Vessel {
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesselType;
	
	public Vessel() {
		
	}
	
	// 4 Argument Cnstructor
	public Vessel(String vesselId,String vesselName,double averageSpeed,String vesselType){
		this.vesselId = vesselId;
		this.vesselName = vesselName;
		this.averageSpeed = averageSpeed;
		this.vesselType = vesselType;
	}
	
	// Getter Method
	public String getvesselId() {
		return vesselId;
	}
	
	public String getvesselName() {
		return vesselName;
	}
	
	public double getaverageSpeed() {
		return averageSpeed;
	}
	
	public String getvesselType() {
		return vesselType;
	}
	
	// Setter Method
	
	public void setvesselId(String id) {
		this.vesselId = id;
	}
	
	public void setvesselName(String name) {
		this.vesselName = name;
	}
	
	public void setaverageSpeed(double speed) {
		this.averageSpeed = speed;
	}
	
	public void setvesselType(String type) {
		this.vesselType = type;
	}
}
