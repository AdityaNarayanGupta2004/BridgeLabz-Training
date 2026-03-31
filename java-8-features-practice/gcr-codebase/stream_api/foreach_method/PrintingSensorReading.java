package stream_api.foreach_method;

import java.util.Arrays;
import java.util.List;

public class PrintingSensorReading {
	public static void main(String[] args) {
		double threshhold = 30.0;
		List<Double> readings = Arrays.asList(3.5, 45.2, 12.7, 51.8, 37.3, 60.0);
		System.out.println("REading above threshhold("+threshhold+") are :");
		readings.stream()
			.filter(r -> r>threshhold)
			.forEach(r->System.out.println(r));
	}
}
