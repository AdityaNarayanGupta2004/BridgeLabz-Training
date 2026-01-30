package Functional_Interface.digitalPayment;

public class CreditCard implements Payment{
	public void pay(double amount) {
		System.out.println("Paid "+ amount +" by creditcard");
	}
}
