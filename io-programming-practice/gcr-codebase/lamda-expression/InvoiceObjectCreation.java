package lamda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    @Override
    public String toString() {
        return "Invoice{" + "transactionId='" + transactionId + '\'' + '}';
    }
}

public class InvoiceObjectCreation {
	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("T001", "T002", "T003", "T004");
        List<Invoice> invoices = transactionIds.stream()
                                 .map(Invoice::new)  // Constructor reference
                                 .collect(Collectors.toList());

        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
	}
}
