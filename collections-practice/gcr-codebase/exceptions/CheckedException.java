import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try{
            File file = new File("data.txt");
            FileReader reader = new FileReader(file);
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }
            reader.close();
        }catch (IOException e){
            System.out.println("File not found");
        }
    }
}
