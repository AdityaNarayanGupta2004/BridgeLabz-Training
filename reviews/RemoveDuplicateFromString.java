import java.util.*;
public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        System.out.println("Original String is"+ string);
        Set<Character> set = new HashSet<>();
        string = string.toLowerCase();
        StringBuilder ans = new StringBuilder();
        for(char ch:string.toCharArray()){
            if(set.add(ch)){
                ans.append(ch);
            }
        }
        System.out.println("After removing dublicte");
        System.out.println(ans.toString());
    }
}
