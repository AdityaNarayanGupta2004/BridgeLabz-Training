package stream_api.foreach_method;

import java.util.Arrays;
import java.util.List;

class Stock{
	String name;
	double price;
	
	Stock(String name, double price){
		this.name = name;
		this.price= price;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name+" => $ "+ price;
	}
}

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Stock> data = Arrays.asList(
				new Stock("Aditya", 100000.0),
				new Stock("Dheeraj", 90000.0),
				new Stock("Suraj", 80000.0),
				new Stock("Sammer", 70000.0),
				new Stock("Ankit", 60000.0),
				new Stock("Priyanshu", 50000.0));
		System.out.println("Live Stock Price:");
		data.stream()
		.forEach(stock -> System.out.println(stock));
	}
}
