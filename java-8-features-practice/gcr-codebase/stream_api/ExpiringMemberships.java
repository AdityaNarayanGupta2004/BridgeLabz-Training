package stream_api;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Member {
    private String name;
    private LocalDate membershipExpiry;

    Member(String name, LocalDate membershipExpiry) {
        this.name = name;
        this.membershipExpiry = membershipExpiry;
    }

    public String getName() {
        return name;
    }

    public LocalDate getMembershipExpiry() {
        return membershipExpiry;
    }

    @Override
    public String toString() {
        return name + " | Gym MemverShip Expiry date: " + membershipExpiry;
    }
}

public class ExpiringMemberships {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
	            new Member("Aditya", LocalDate.now().plusDays(50)),
	            new Member("Dheeraj", LocalDate.now().plusDays(40)),
	            new Member("Sameer", LocalDate.now().plusDays(25)),
	            new Member("Suraj", LocalDate.now().plusDays(5)),
	            new Member("Priyanshu", LocalDate.now().plusDays(10))
	        );
		List<Member> expiry = members.stream()
				.filter(m -> !m.getMembershipExpiry().isAfter(LocalDate.now().plusDays(30)))
	            .toList();

	    System.out.println("Members whose membership expires within 30 days:");
	    expiry.forEach(System.out::println);
	}
}
