import java.util.*;
public class ReversingaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Original String is : "+ str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String reversed = sb.toString();  
        System.out.println("Reversed string is : " + reversed);
    }
}
