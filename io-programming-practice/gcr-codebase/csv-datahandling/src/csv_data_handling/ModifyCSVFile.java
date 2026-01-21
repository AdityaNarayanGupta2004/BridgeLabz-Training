package csv_data_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyCSVFile {
	public static void main(String[] args) throws IOException {
		 String inputFile = "csvdata\\data.csv";
	     String outputFile = "csvdata\\data_updated.csv";
	     BufferedReader br = new BufferedReader(new FileReader(inputFile));
         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
         String line = br.readLine();
         bw.write(line);
         bw.newLine();
         while ((line = br.readLine()) != null){
             String[] data = line.split(",");
             String id = data[0];
             String name = data[1];
             String department = data[2];
             double salary = Double.parseDouble(data[3]);
             if (department.equalsIgnoreCase("IT")) {
                 salary = salary * 1.10;
             }
             bw.write(id + "," + name + "," + department + "," + salary);
             bw.newLine();
         }
	}
	
}
