package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private String customer;
    private double total;

    public Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }
}


public class OrderRevenueSummary {
	public static void main(String[] args) {
		 List<Order> orders = Arrays.asList(
				 new Order("Aditya", 120.5),
		         new Order("Dheeraj", 75.0),
		         new Order("Aditya", 55.5),
		         new Order("Dheeraj", 45.0),
		         new Order("aman", 200.0));
		 Map<String, Double> revenuePerCustomer = orders.stream()
		            .collect(Collectors.groupingBy(
		                Order::getCustomer,
		                Collectors.summingDouble(Order::getTotal)
		            ));
		 revenuePerCustomer.forEach((customer, total) ->
		 System.out.println(customer + ": $" + total));
	}
}
