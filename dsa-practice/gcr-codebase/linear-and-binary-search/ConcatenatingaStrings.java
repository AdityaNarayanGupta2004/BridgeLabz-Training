import java.util.*;
public class ConcatenatingaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = {"Hello", " ", "World", "!", " Welcome", " to", " Java."};
        String result = concatenateUsingStringBuffer(strArray);
        System.out.println("Concatenated String after iteration: " + result);
    }

    public static String concatenateUsingStringBuffer(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }
}


