import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        boolean[] count = new boolean[n]; 
        for(int i = 0; i < n; i++){
            if(count[i]) continue; 
            char ch = str.charAt(i);
            int cntt = 1;
            for(int j = i + 1; j < n; j++){
                if(str.charAt(j) == ch){
                    cntt++;
                    count[j] = true;
                }
            }
            System.out.println(ch + " = " + cntt);
        }

    }
}
