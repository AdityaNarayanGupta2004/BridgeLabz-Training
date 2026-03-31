package future_logistics;

public class Utility {
	public GoodsTransport parseDetails(String input) {
		String data[] = input.split(":");
		
		// both class common data
		String transportId = data[0];
		String transportdate = data[1];
		int transportrating = Integer.parseInt(data[2]);
		String transPortType = data[3];
		
		if(validateTransportId(transportId)) {
			if(transPortType.equalsIgnoreCase("BrickTransport")) {
				
				// Brick Class Uncommon data
				float brickSize = Float.parseFloat(data[4]);
				int brickQuantity = Integer.parseInt(data[5]);
				float brickPrice = Float.parseFloat(data[6]);
				
				return new BrickTransport(transportId,transportdate,transportrating,
						brickSize,brickQuantity,brickPrice);
			}
			if(transPortType.equalsIgnoreCase("TimberTransport")) {
				
				// Timber Uncommon Data
				float timberLength = Float.parseFloat(data[4]);;
				float timberRadius=Float.parseFloat(data[5]);
				String timberType = data[6];
				
				return new TimberTransport(transportId,transportdate,transportrating,
						timberLength,timberRadius,timberType, Float.parseFloat(data[7]));
			}
		}
		return null;
	}
	
	// Method to validate a transport ID
	public boolean validateTransportId(String transportId) {
		if(transportId.matches("^RTS[0-9]{3}[A-Z]{1}$")) {
			return true;
		}
		
		System.out.println("TransPort ID "+ transportId +" is Invalid");
		return false;
	}
	
	public String findObjectType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof BrickTransport) return "BrickTransport";
		else if(goodsTransport instanceof TimberTransport) return "TimberTransport";
		else {
			return null;
		}
	}
}
