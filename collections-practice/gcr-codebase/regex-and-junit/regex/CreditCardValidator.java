import java.util.regex.*;
public class CreditCardValidator {
    public static void main(String[] args) {
        String[] cards = {"4123456789012345","5123456789012345","6123456789012345", "412345678901234"};
        for(String card : cards){
            System.out.println(card + "->" + isValidCreditCard(card));
        }
    }
    public static boolean isValidCreditCard(String cardNumber){
        String regex = "^(4\\d{15}|5\\d{15})$";
        return Pattern.matches(regex, cardNumber);
    }
}
