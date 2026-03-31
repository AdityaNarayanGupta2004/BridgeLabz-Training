package future_logistics;

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goods Transport details:");
		String input = sc.next(); // taking a input as String
		
		Utility utility = new Utility(); // making a object of Utility Class
		
//		if(utility.parseDetails(detail) == null) return;
//		System.out.println("TransPort ID: " + utility.parseDetails(detail).gettransportId()+"\n");
//		System.out.println("Date Of transport: " + utility.parseDetails(detail).gettransportDate());
//		System.out.println("Rating Of Transport: " + utility.parseDetails(detail).gettransportRating());
		
		GoodsTransport goodstransport = utility.parseDetails(input);
		
		String ObjectType = utility.findObjectType(goodstransport);
		
		if(goodstransport == null) {
			System.out.println("Please provide a valid record");
			return;
		}
		
		if(ObjectType.equalsIgnoreCase("BrickTransport")) {
			
			BrickTransport brick = (BrickTransport) goodstransport; // DownCasting
			
			System.out.println("Transporter id: "+ brick.transportId);
			System.out.println("Date of transport : "+ brick.transportDate);
			System.out.println("Rating of the transport : "+ brick.transportRating);
			System.out.println("Quantity of bricks : "+ brick.getbrickQuantity());
			System.out.println("Brick Price: "+ brick.getbrickPrice());
			System.out.println("Vehicle for transport : "+ brick.vehicleSelection());
			System.out.println("total charge: "+ brick.calculateTotalCharge());
		}
		
		if(ObjectType.equalsIgnoreCase("TimberTransport")) {
			
			TimberTransport timber = (TimberTransport) goodstransport; // DownCasting
			
			System.out.println("Transporter id: "+ timber.transportId);
			System.out.println("Date of transport : "+ timber.transportDate);
			System.out.println("Rating of the transport : "+ timber.transportRating);
			System.out.println("Type of the timber : "+ timber.gettimberType());
			System.out.println("Timber price per kilo: "+ timber.gettimberPrice());
			System.out.println("Vehicle for transport : "+ timber.vehicleSelection());
			System.out.println("total charge:" + timber.calculateTotalCharge());
		}
		
	}
}
