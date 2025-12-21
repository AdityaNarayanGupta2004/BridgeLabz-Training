import java.util.Scanner;

public interface ComparsionOfUpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String str =  sc.nextLine();
        String builtInUpper = str.toUpperCase();
        String customUpper = convertUpper(str);
        boolean isEqual = compareString(builtInUpper, customUpper);
        System.out.println("Uppercase using builtin function: " + builtInUpper);
        System.out.println("Uppercase using mannual function: " + customUpper);
        System.out.println("Are both uppercase versions equal " + isEqual);
    }

    public static String convertUpper(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ans.append((char)(ch - 32));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static boolean compareString(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
