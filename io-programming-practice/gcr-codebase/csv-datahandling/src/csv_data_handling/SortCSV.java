package csv_data_handling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class SortCSV {

    public static void main(String[] args) throws Exception {
        String fileName = "csvdata\\employeedata.csv";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        List<String[]> allData = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            allData.add(values);
        }
        br.close();

        String[] header = allData.remove(0);

        allData.sort((r1, r2) -> {
            double s1 = Double.parseDouble(r1[3]);
            double s2 = Double.parseDouble(r2[3]);
            return Double.compare(s2, s1);
        });

        System.out.println(header[0] + ", " + header[1] + ", " + header[2] + ", " + header[3]);

        for (String[] rec : allData) {
            for (int i = 0; i < rec.length; i++) {
                System.out.print(rec[i]);
                if (i < rec.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
