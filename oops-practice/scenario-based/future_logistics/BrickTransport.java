package future_logistics;

import java.util.HashMap;

public class BrickTransport extends GoodsTransport {
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId, String transportDate, int transportRating,
		float brickSize,int brickQuantity,float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	// Setter Methods
	public void setbrickSize(float bricksize) {
		this.brickSize = bricksize;
	}
	
	public void setbrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	
	public void setbrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	// Getter Method
	public float getbricksize() {
		return brickSize;
	}
	
	public int getbrickQuantity() {
		return brickQuantity;
	}
	
	public float getbrickPrice() {
		return brickPrice;
	}
	
	// Vehicle Selection Method
	public String vehicleSelection() {
		if(brickQuantity < 300) return "Truck";
		else if(brickQuantity >= 300 && brickQuantity <= 500) return "Lorry";
		else {
			return "MonsterLorry";
		}
	}
	
	// Total Charge Calculation Method
	public float calculateTotalCharge() {
		String VehicleType = vehicleSelection();
		double VehiclePrice= 0.0;
		if(VehicleType.equals("Truck")) VehiclePrice = 1000;
		else if(VehicleType.equals("Lorry")) VehiclePrice = 1700;
		else if(VehicleType.equals("MonsterLorry")) VehiclePrice = 3000;
		
		String vehicleType = vehicleSelection();
		
		double discountPercentage;
		if(transportRating == 5) discountPercentage = 0.2;
		else if(transportRating == 3 || transportRating == 4) discountPercentage = 0.1;
		else {
			discountPercentage = 0;
		}
		double Price = (getbrickPrice()*getbrickQuantity()); // total brick cost
		double Tax = Price * 0.3;
		double Discount = Price * discountPercentage;
		
		float totalcharge = (float)(((Price)+VehiclePrice+Tax) - Discount);
//		System.out.println("VehiclePrice:"+VehiclePrice);
//		System.out.println("Discount: "+ Discount);
//		System.out.println("discountPercentage"+ discountPercentage);
//		System.out.println("Price"+ Price);
		return totalcharge;
	}
}
