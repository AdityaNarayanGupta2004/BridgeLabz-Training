import java.util.Scanner;
public class SubstringOccurrencesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String substring = sc.nextLine();
        System.out.println("Occurrences of '" + substring + "': " + SubstringOccurrencesCount(str, substring));
    }
    public static int SubstringOccurrencesCount(String str, String sub) {
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)){
                count++;
            }
        }
        return count;
    }
}

