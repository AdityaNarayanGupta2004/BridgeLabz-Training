package lamda_expression;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

class Patients {
    String id;
    String name;

    public Patients(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
}

public class HospitalPatientIDPrinting {
	public static void main(String[] args) {
		List<Patients> patient = new ArrayList<>();
		patient.add(new Patients("P001", "Aditya"));
        patient.add(new Patients("P002", "Aman"));
        patient.add(new Patients("P003", "Suraj"));
        patient.add(new Patients("P004", "Dheeraj"));
        patient.add(new Patients("P004", "Madhav"));
        
        System.out.println("Patients IDs:");
        patient.stream().map(Patients::getId).forEach(System.out::println);
	}
}
