import java.util.*;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        int strLength = LengthWithoutBuiltIn(str);// length by making function
        int builtInLength = str.length();
        System.out.println("Length by making a function: " + strLength);
        System.out.println("Length using built-in : " + builtInLength);
    }

    public static int LengthWithoutBuiltIn(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(IndexOutOfBoundsException e){
            return count;
        }
    }
}
