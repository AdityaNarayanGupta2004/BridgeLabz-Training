package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCountRowsCSVFile {
	public static void main(String[] args) throws IOException {
		String csvfile = "csvdata\\studentdata.csv";
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader(csvfile));
		String line = br.readLine();
		 while ((line = br.readLine()) != null) {
             if (!line.trim().isEmpty()) { 
                 count++;
             }
		 }
		 System.out.println("Number of records: " + count);
	}
}
