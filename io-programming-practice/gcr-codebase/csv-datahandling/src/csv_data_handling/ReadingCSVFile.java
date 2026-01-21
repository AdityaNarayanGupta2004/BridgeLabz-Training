package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCSVFile {
	public static void main(String[] args) throws IOException{
		String filePath = System.getProperty("user.dir")+"\\csvdata\\studentdata.csv";
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;
	    while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            for(String value: columns) {
            	System.out.print(value+"\t");
            }
            System.out.println();
        }
	}
}

