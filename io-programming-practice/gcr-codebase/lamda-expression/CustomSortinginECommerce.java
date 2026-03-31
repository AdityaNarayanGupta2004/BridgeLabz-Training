package lamda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Products {
    String name;
    double price;
    double rating;
    double discount;

    public Products(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " [Price: " + price + ", Rating: " + rating + ", Discount: " + discount + "%]";
    }
}

public class CustomSortinginECommerce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Products> prod = new ArrayList<>();
		prod.add(new Products("Laptop", 120000, 4.5, 10));
        prod.add(new Products("Smartphone", 80000, 4.7, 15));
        prod.add(new Products("Headphones", 1500, 4.2, 5));
        prod.add(new Products("Monitor", 3000, 4.4, 20));
        System.out.println("Enter the name by which you want to sort: price, rating, discount");
        String campaign = sc.next();
        if (campaign.equalsIgnoreCase("price")) {
            Collections.sort(prod, new Comparator<Products>() {
                public int compare(Products p1, Products p2) {
                    return Double.compare(p1.price, p2.price); // ascending
                }
            });
        }else if(campaign.equalsIgnoreCase("rating")) {
            Collections.sort(prod, new Comparator<Products>() {
                public int compare(Products p1, Products p2) {
                    return Double.compare(p2.rating, p1.rating); // descending
                }
            });
        }
        else if (campaign.equalsIgnoreCase("discount")) {
            Collections.sort(prod, new Comparator<Products>() {
                public int compare(Products p1, Products p2) {
                    return Double.compare(p2.discount, p1.discount); // descending
                }
            });
        }
        System.out.println("Sorted products by " + campaign + ":");
        for (Products p : prod) {
            System.out.println(p);
        }
	}
}
