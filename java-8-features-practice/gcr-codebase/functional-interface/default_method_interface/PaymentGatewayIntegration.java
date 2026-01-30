package Functional_Interface.default_method_interface;

public class PaymentGatewayIntegration {
	public static void main(String[] args) {
		PaymentProcessor paypal = new PayPalProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        paypal.processPayment(100);
        stripe.processPayment(200);
        
        paypal.refund(50); 
        stripe.refund(100);
	}
}
interface PaymentProcessor{
	void processPayment(double amount);
		
	default void refund(double amount) {
		System.out.println("Refund of $ "+ amount + " is processed by defaullt method");
	}
}

class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund via PayPal: $" + amount);
    }
}

class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
