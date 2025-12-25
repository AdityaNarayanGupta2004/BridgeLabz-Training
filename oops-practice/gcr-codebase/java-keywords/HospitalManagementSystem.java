class Patient {
    // static variable
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    // Instance variable
    private final int patientId;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientId, String name, int age, String ailment) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted in hospital are: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Details of patient are: --");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("patient Age: " + age);
        System.out.println("patient Ailment: " + ailment);
        System.out.println("");
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(01, "mohan", 32, "dengu");
        Patient patient2 = new Patient(02, "sohan", 45, "Cold");
        System.out.println();
        System.out.println("Hospital Name: " + Patient.hospitalName);
        System.out.println();
        // checking wheater the patient1 and patient2 are the object of patient class or not
        if (patient1 instanceof Patient) {
            patient1.displayDetails();
        }
        if (patient2 instanceof Patient) {
            patient2.displayDetails();
        }

        Patient.getTotalPatients();
    }
}
