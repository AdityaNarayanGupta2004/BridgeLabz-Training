/*The Coffee Counter Chronicles ☕
Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
that:
● Asks for coffee type (switch)
● Calculates total bill (price * quantity)
● Adds GST using arithmetic operators
Use while to continue for the next customer and break when "exit" is typed.
 */

import java.util.*;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double GStRate = 0.18; // 18% GST ficxed
        while(true){
            System.out.println("Welcome to Ravi's Cafe!");
            System.out.println("Enter coffee type (Espresso, Latte, Cappuccino, Mocha) or 'exit' to quit: ");
            String coffeetype = sc.nextLine().toLowerCase();

            if (coffeetype.equals("exit")) {
                System.out.println("Thank You for visiting the Ravi's Cafee");
                break;
            }
            int coffeePrice = 0;
            switch (coffeetype) {
                case "espresso":
                    coffeePrice = 70;
                    break;
                case "latte":
                    coffeePrice = 900;
                    break;
                case "cappuccino":
                    coffeePrice = 100;
                    break;
                case "mocha":
                    coffeePrice = 120;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please Enter it again According to given menu");
                    continue;
            }

            System.out.println("Enter the quantity of coffee you choose:");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if(quantity < 0){
                System.out.println("Quantity must be a positive number, Please Enter it again");
                continue;
            }

            double subtotal = coffeePrice * quantity;
            double gstAmount = subtotal * GStRate;
            double totalBill = subtotal + gstAmount;

            System.out.println("\n Your Order Summary ");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("GST (18%): $" + gstAmount);
            System.out.println("Total Bill:Subtotal+GST: $" + totalBill);
            System.out.println(); 
            System.out.println("Want to exit or to order something");
            System.out.println("please choose : Exit, order");
            String choice = sc.nextLine().toLowerCase();
            if (choice.equals("exit")) {
                System.out.println("Thank You for visiting the Ravi's Cafee, GoodBye");
                break;
            }else{
                continue;
            }
            // System.out.println("Any feedback About our cafee Service"); 
            // System.out.println("Select Any one of the following: Excelent, Good, Bad");
        }

        sc.close();
    }
}
