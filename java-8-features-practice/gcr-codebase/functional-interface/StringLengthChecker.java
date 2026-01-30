package Functional_Interface;

import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		String message = "Hello, this is a sample message";
		int maxLimit = 50;
		Function<String , Integer> stringlength = str -> str.length();
		int length = stringlength.apply(message);
		if(length > maxLimit) {
			System.out.println("Message Exceeded the character limit");
		}else {
			System.out.println("Message is within the Character limmit");
		}
		System.out.println("Character count: "+ length);
	}
}
