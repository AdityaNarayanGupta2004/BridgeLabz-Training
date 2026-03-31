package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Claim {
    private String claimType;
    private double amount;

    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}



public class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = Arrays.asList(
				new Claim("Health", 12000),
	            new Claim("Vehicle", 8000),
	            new Claim("Health", 15000),
	            new Claim("Home", 20000),
	            new Claim("Vehicle", 10000),
	            new Claim("Health", 18000)
	        );
		
		 Map<String, Double> averageClaimAmount = claims.stream()
				 .collect(Collectors.groupingBy(
						 c -> c.getClaimType(),
						 Collectors.averagingDouble(c -> c.getAmount())
		                ));

		 System.out.println("Average claim amount per claim type:");
		 averageClaimAmount.forEach((type, avg) ->
		 System.out.println(type + " -> " + avg));
	}

}
