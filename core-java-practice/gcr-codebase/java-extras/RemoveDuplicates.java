import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Without Duplicates the string is: " + removeDuplicates(str));
    }
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
