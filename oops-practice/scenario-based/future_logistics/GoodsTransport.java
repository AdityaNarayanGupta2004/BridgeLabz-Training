package future_logistics;

public abstract class GoodsTransport {
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
	
	public GoodsTransport(String transportId, String transportDate, int transportRating) {
		this.transportId = transportId;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}
	// Getter and Setter
	public void settransportId(String id) {
		this.transportId = id;
	}
	
	public void settransportDate(String date) {
		this.transportDate = date;
	}
	
	public void settransportRating(int rating) {
		this.transportRating = rating;
	}
	
	public String gettransportId() {
		return transportId;
	}
	public String gettransportDate() {
		return transportDate;
	}
	public int gettransportRating() {
		return transportRating;
	}
	
	// abstract Method
	public abstract String vehicleSelection();
	
	public abstract float calculateTotalCharge();
}
