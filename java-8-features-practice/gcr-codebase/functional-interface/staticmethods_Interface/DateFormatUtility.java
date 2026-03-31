package Functional_Interface.staticmethods_Interface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatUtility {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
        String format1 = DateUtils.formatDate(today, "dd/MM/yyyy");
        String format2 = DateUtils.formatDate(today, "MMMM dd, yyyy");
        String format3 = DateUtils.formatDate(today, "yyyy-MM-dd");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
	}
	public interface DateUtils {
	    static String formatDate(LocalDate date, String pattern) {
	        if(date == null || pattern == null || pattern.isEmpty()) {
	            throw new IllegalArgumentException("Date and pattern must not be null or empty");
	        }
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
	        return date.format(formatter);
	    }
	}

}
