import java.util.Scanner;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] unique = UniqueCharFind(str);
        System.out.println("Unique characters in the string:");
        for (int i = 0; i < getLength(new String(unique)); i++) {
            System.out.print(unique[i] + " ");
        }
    }
    public static char[] UniqueCharFind(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count] = ch;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }
     public static int getLength(String str){
        int length = 0;
        try {
            while(true) {
                str.charAt(length);
                length++;
            }
        } catch(Exception e) {
        }
        return length;
    }
}
