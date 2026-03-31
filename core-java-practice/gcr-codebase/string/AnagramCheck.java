import java.util.*;

public class AnagramCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean result = IsAnagram(str1, str2);
        if(result){
            System.out.println("The String is anagram");
        }else{
            System.out.println("The String is not anagram");
        }
    }
    public static boolean IsAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] freq = new int[256];
        for(int i = 0; i < str1.length(); i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        for(int count:freq){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
}
