package csv_data_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergingCSV {
	public static void main(String[] args) throws IOException {
		String file1 = "csvdata\\student1.csv";
        String file2 = "csvdata\\student2.csv";
        String outputFile = "csvdata\\student_merged.csv";

        Map<String, String[]> studentMap = new HashMap<>();
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                studentMap.put(data[0], new String[]{data[1], data[2]});
            }
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();
            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                if (studentMap.containsKey(id)) {
                    String[] studentInfo = studentMap.get(id);
                    bw.write(id + "," +studentInfo[0] + "," +studentInfo[1] + "," +data[1] + "," +data[2]);
                    bw.newLine();
                }
            }
            bw.flush();
            br1.close();
            br2.close();
            bw.close();
            System.out.println("CSV files merged successfully!");

	}
}
