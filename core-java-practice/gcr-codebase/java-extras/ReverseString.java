import java.util.*;
public class Revers_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Reversed String is : " + reverseString(str));
    }
    public static String reverseString(String str) {
        String reversedstr = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversedstr += str.charAt(i);
        return reversedstr;
    }
}
