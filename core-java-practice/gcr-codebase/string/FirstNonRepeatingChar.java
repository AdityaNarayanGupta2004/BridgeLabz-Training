import java.util.*;
public class FirstNonRepeatingChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        boolean find = false;
        for(Map.Entry<Character, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeating character: " + entry.getKey());
                find = true;
                break;
            }
        }
        if(!find){
            System.out.println("No non-repeating character found.");
        }

    }
}
