
package csv_data_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataInCSVFile {
	public static void main(String[] args) throws IOException {
		String filePath = "csvdata\\studentdata.csv";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		writer.write("ID,Name,Department,Salary\n");
        writer.write("104,Alice Williams,Finance,62000\n");
        writer.write("105,Bob Johnson,Sales,58000\n");
        System.out.println("CSV file written successfully!");
        
        writer.close();
	}
}
