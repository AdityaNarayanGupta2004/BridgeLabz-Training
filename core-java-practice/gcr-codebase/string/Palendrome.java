import java.util.*;
public class Palendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = 0;
        int length = str.length()-1;
        while(idx <= length){
            if(str.charAt(idx) != str.charAt(length)){
                System.out.println("The Given String is Not Palendrome");
                return;
            }
            idx++;
            length--;
        }
        System.out.println("The given String is palendrome");
    }
}
