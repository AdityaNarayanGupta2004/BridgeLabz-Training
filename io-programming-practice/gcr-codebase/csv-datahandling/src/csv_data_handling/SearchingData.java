package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchingData {
	public static void main(String[] args) throws IOException {
		String csvfile = "csvdata\\data.csv";
		boolean found = false;
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to be found:");
		String searchName = sc.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(csvfile));
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String name = data[1];
            if (name.equalsIgnoreCase(searchName)) {
                String department = data[2];
                String salary = data[3];
                System.out.println("Employee Found: ");
                System.out.println("Department: " + department);
                System.out.println("Salary: " + salary);
                found = true;
                break;
            }
        }

	}
}
