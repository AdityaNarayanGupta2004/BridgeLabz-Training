package stream_api.foreach_method;

import java.util.Arrays;
import java.util.List;

public class EmailNotification {
	public static void main(String[] args) {
		List<String> email = Arrays.asList("adi@gmail.com","dheer@gmail.com",
	            "madhav@example.com","aman@example.com","surj@example.com");
		
		email.stream()
			.forEach(em -> sendEmailNotification(em));
	}
	
	public static void sendEmailNotification(String email){
		System.out.println("Sending email to: "+ email);
	}
}
