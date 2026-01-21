package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterRecordsOfCsvfile {
	public static void main(String[] args) throws IOException {
		String csvfile = "csvdata\\studentdata.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvfile));
		String line = br.readLine();
		System.out.println("Students scoring more than 80:");
		 while ((line = br.readLine()) != null) {
             String[] data = line.split(",");
             String id = data[0];
             String name = data[1];
             String age = data[2];
             int marks = Integer.parseInt(data[3]);

             if (marks >= 80) {
                 System.out.println(id + ", " + name +  ", " + age+", " + marks);
             }
         }
	}
}
