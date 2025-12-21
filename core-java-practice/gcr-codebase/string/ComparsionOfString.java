import java.util.*;
public class ComparsionOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = sc.next();
        System.out.println("Enter second String: ");
        String str2 = sc.next();
        boolean charResult = charAtFun(str1, str2); 
        boolean equalsResult = str1.equals(str2);// Compare using built-in equals()
        System.out.println("Result using charAt(): " + charResult);
        System.out.println("Result using equals(): " + equalsResult);

        if(charResult == equalsResult){
            System.out.println("Both methods give the SAME result.");
        }else{
            System.out.println("Both methods give DIFFERENT results.");
        }

    }
    public static boolean charAtFun(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        // Compare each character
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
