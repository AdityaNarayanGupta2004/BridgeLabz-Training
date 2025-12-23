import java.util.*;
public class CountVowelsAndConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        countVowelsAndConsonants(str);
    }

public static void countVowelsAndConsonants(String str) {
    int vowels = 0;
    int consonants = 0;
    str = str.toLowerCase();
    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) {
            if ("aeiou".indexOf(c) != -1)
                vowels++;
            else
                consonants++;
        }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}
}

