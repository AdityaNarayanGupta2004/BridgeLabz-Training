package future_logistics;

public class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	// constructor
	public TimberTransport(String transportId, String transportDate, int transportRating,
		float timberLength,float timberRadius,String timberType,float timberPrice) {
		
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	
	// Setter Methods
	public void settimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	
	public void settimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	
	public void settimberType(String timberType) {
		this.timberType = timberType;
	}
	
	public void settimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	// Getter Method
	public float timberLength() {
		return timberLength;
	}
	
	public float gettimberRadius() {
		return timberRadius;
	}
	
	public String gettimberType() {
		return timberType;
	}
	
	public float gettimberPrice() {
		return timberPrice;
	}
		// Method to Select the Vechicle
	public String vehicleSelection() {
		double Area = 2*3.147*timberRadius*timberLength;
		if(Area < 250) return "Truck";
		else if(Area >= 250 && Area <= 400) return "Lorry";
		else {
			return "MonsterLorry";
		}
	}
	
	// Method to calculate the total Charge
	public float calculateTotalCharge() {
		String VehicleType = vehicleSelection();
		int VehiclePrice = 0;
		if(VehicleType.equals("Truck")) VehiclePrice = 1000;
		else if(VehicleType.equals("Lorry")) VehiclePrice = 1700;
		else if(VehicleType.equals("MonsterLorry")) VehiclePrice = 3000;
		
		double discountPercentage;
		if(transportRating == 5) discountPercentage = 0.2;
		else if(transportRating == 3 || transportRating == 4) discountPercentage = 0.1;
		else {
			discountPercentage = 0;
		}
		double timberTypeValue = 0;
		if(timberType.equals("Premium")) timberTypeValue = 0.25;
		else if(timberType.equals("NonPremium")){
			timberTypeValue = 0.15;
		}
		double Volume = 3.147 * timberRadius * timberRadius * timberLength;
		double Price = Volume * timberPrice * timberTypeValue;
		double Tax = Price*0.3;
		double discount = Price*discountPercentage;
		float totalCharge = (float)(((Price) + VehiclePrice + Tax) - discount);
		return totalCharge;
	}
}

