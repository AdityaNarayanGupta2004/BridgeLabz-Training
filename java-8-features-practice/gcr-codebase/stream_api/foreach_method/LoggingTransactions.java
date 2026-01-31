package stream_api.foreach_method;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LoggingTransactions {
	public static void main(String[] args) {
		List<String> ids = Arrays.asList("TXN101","TXN102","TXN103","TXN104", "TXN105");
		
		ids.forEach(id->
				System.out.println(LocalDateTime.now() + " Transaction ID is: "+ id));
	}
}
