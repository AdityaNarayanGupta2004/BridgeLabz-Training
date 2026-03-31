package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetectDuplicateCSV {
	public static void main(String[] args) throws IOException {
		String csvFile = "csvdata\\employeedata.csv";
        String line;
        Map<String, List<String>> recordMap = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                recordMap.computeIfAbsent(id, k -> new ArrayList<>()).add(line);
            }
        System.out.println("Duplicate Records (based on ID):");
        boolean found = false;
        for (Map.Entry<String, List<String>> entry : recordMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                found = true;
                entry.getValue().forEach(System.out::println);
            }
        }
        if (!found) {
            System.out.println("No duplicate records found.");
        }

	}
}
