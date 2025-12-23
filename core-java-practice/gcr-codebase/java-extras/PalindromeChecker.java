import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        boolean ans = isPalendrome(ch);
        display(ans);
    }
    private static boolean isPalendrome(char ch[]){
        int mid = ch.length/2;
        int end = ch.length-1;
        for(int i = 0; i < mid; i++){
            if(ch[i] != ch[end]){
                return false;
            }
            else{
                end--;
            }
        }
        return true;
    }

    private static void display(boolean flag){
        if(flag){
            System.out.print("Its a Palindrome");
        }else{
            System.out.print("It's Not a palendrome");
        }
    }
}
