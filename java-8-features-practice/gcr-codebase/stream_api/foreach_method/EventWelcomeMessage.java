package stream_api.foreach_method;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMessage {
	public static void main(String[] args) {
		List<String> student = Arrays.asList("Aditya","Dheeraj","Sammer","Suraj","Madhav","PRiyanshu");
		student.stream()
		.forEach(st -> System.out.println(st+" Welcome to the Coding event!"));
	}
}
