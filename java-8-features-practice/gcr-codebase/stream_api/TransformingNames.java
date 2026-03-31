package stream_api;

import java.util.Arrays;
import java.util.List;

public class TransformingNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aditya", "Dheeraj", "Sameer", "Madhav", "Suraj");
		List<String> transformedNames = names.stream()
				.map(name -> name.toUpperCase())
				.sorted()
				.toList();
		
		System.out.println("Transformed names are:");
		transformedNames.forEach(System.out::println);
	}
}
