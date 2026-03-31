import java.util.Scanner;

public class UniqueCharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stirng: ");
        String str = sc.nextLine();
        String[][] freq = charFrequencies(str);

        System.out.println("Character  Frequency");
        for(int i = 0; i < freq.length; i++){
            System.out.println(freq[i][0] + "\t" + freq[i][1]);
        }
    }

    public static char[] UniqueCharacter(String str){
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        char[] unique = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count++] = ch;
            }
        }

        char[] result = new char[count];
        for(int i = 0; i < count; i++){
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] charFrequencies(String str) {
        int[] freq = new int[256];
        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                freq[ch]++;
            } catch (Exception e) {
                break;
            }
        }

        char[] uniqueChars = UniqueCharacter(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }
}
