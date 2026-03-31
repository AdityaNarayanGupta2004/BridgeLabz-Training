import java.util.*;

public class ComparisionOfSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origstr = sc.next();// original string
        int start = sc.nextInt();
        int end = sc.nextInt();
        String manualSubstring = Create(origstr, start, end);
        String builtSubstring = origstr.substring(start, end);
        boolean areEqual = Compare(manualSubstring, builtSubstring);
        System.out.println("Manual Substring using charAt: " + manualSubstring);
        System.out.println("Built-in Substring: " + builtSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }

    public static String Create(String str, int start, int end) {
        String ans = "";
        for (int i = start; i < end && i < str.length(); i++) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static boolean Compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
