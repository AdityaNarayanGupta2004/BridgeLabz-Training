package demo1;
import java.util.*;

public class FlipKeyLogicalProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = sc.nextLine();
		String checkword1[] = input.split("[,\\s]+");
		
		if(checkword1.length > 1) { // checking whether a string is of one word or not
			System.out.println("Invalid Input");
			return;
		}
		String result = CleanseAndInvert(input); // calling a method
		if(result.length() == 0) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("The generatd Key is-"+result);
		}
		sc.close();
	}
	public static String CleanseAndInvert(String str) {
		if(str.length() < 6) return ""; 
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >='a' && str.charAt(i) <= 'z') {
				continue;
			}
			else
			return "";
		}
		
		String newString = "";
		for(int i = 0; i < str.length(); i++) { // removing the character at even position
			if((int)str.charAt(i) % 2 == 0) {
				continue;
			}
			else {
				newString += str.charAt(i)+"";
			}
		}
		String revesedString = ""; //new String for reversed version
		for(int i = newString.length()-1; i >= 0;i--) { // reversing a string
			revesedString += newString.charAt(i)+"";
		}
		
		String ans = ""; // storing the resultant string
		for(int i = 0; i < revesedString.length();i++) {
			if(i % 2 == 0) {
				ans += (revesedString.charAt(i)+"").toUpperCase(); // converting a even position character to Uppercase
			}else {
				ans+= revesedString.charAt(i)+"";
			}
		}
		return ans; // retutning the ans
	}
}
