import java.util.*;
public class ComparsionOfLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str = scanner.nextLine();
        String builtInLower = str.toLowerCase();
        String customLower = convertLower(str);
        boolean isEqual = compareStrings(builtInLower, customLower);
        System.out.println("Lowercase using builtin function: " + builtInLower);
        System.out.println("Lowercase using manual function:  " + customLower);
        System.out.println("Are both lowercase versions equal " + isEqual);
        scanner.close();
    }

    public static String convertLower(String text) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char)(ch + 32));
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
