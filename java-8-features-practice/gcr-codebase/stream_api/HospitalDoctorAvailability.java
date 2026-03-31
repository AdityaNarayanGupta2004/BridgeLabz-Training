package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Doctor {
    private String doctorName;
    private String specialty;
    private boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.doctorName = doctorName;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getName() {
        return doctorName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    @Override
    public String toString() {
        return doctorName + " | " + specialty;
    }
}

public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(
				new Doctor("Dr. Sharma", "Cardiology", true),
		        new Doctor("Dr. Mehta", "Neurology", false),
		        new Doctor("Dr. Rao", "Orthopedics", true),
		        new Doctor("Dr. Khan", "Dermatology", true),
		        new Doctor("Dr. Patel", "Cardiology", false)
		    );
		List<Doctor> weekendDoctors = doctors.stream()
				.filter(d -> d.isAvailableOnWeekend())   // weekend availability
		        .sorted((d1, d2) -> d1.getSpecialty().compareTo(d2.getSpecialty()))
		        .toList();
		System.out.println("Doctors available on weekends:");
		weekendDoctors.forEach(System.out::println);
	}
}
