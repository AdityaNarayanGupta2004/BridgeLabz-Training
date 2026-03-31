package demo1;
import java.util.*;

public class LexicalTwist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word"); // taking input of first word
		String word1 = sc.nextLine().toLowerCase();
		String checkword1[] = word1.split("[,\\s]+");
		
		if(checkword1.length > 1) { // checking whether a string is of one word or not
			System.out.println("Invalid String of word1");
			return;
		}
		
		System.out.println("Enter the second word"); // taking input of second word
		String word2 = sc.next().toLowerCase();
		String checkword2[] = word2.split("[,\\s]+");
		
		if(checkword2.length > 2) { // checking whether a string is of one word or not
			System.out.println("Invalid String of word2");
		}
		
		if(isReversed(word1, word2)) { // checking whether the string are reverse to each other
			String ans = reversedVersion(word1);
			System.out.println(ans);
		}
		else {
			String SingleWord = (word1+word2).toUpperCase();
			int vowel = countVowel(SingleWord);
			int consonent = countConsonent(SingleWord);
//			System.out.println(vowel);
//			System.out.println(consonant);
//			System.out.println("Vowel Set: " + set1);
//			System.out.println("Consonant Set: " + set2);
			if(vowel > consonent) {
				ArrayList<Character> list1 = new ArrayList<>(set1);
				System.out.println((list1.get(0)+""+list1.get(1)+"").toUpperCase());
			}
			else if(consonent > vowel) {
				ArrayList<Character> list2 = new ArrayList<>(set2);
				System.out.println((list2.get(0)+""+list2.get(1)+"").toUpperCase());
			}
			else {
				System.out.println("Vowels and consonants are equal");
			}
		}
	}
	
	static HashSet<Character> set1 = new LinkedHashSet<>();// to store vowel of string
	static HashSet<Character> set2 = new LinkedHashSet<>(); // to store consonant of string
	
	public static boolean isReversed(String str1, String str2){ // Checking reverse
		String rev = "";
		for(int i = str2.length()-1; i >= 0; i--) {
			rev += str2.charAt(i)+"";
		}
		if(rev.equals(str1)) {
			return true;
		}
		return false;
	}
	
	public static String reversedVersion(String str) { // Adding a @ to reversed version of String
		String ans = "";
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				ch = '@';
			}
			ans += ch+"";
		}
		return ans;
	}
	
	public static int countVowel(String str) { // counting vowel in a string
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
				set1.add(str.charAt(i));
			}
		}
		return count;
	}
	
	public static int countConsonent(String str) { // counting Consonant in a String
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i) <= 'z' && str.charAt(i) != 'a' && str.charAt(i) != 'e' &&
					str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
				count++;
				set2.add(str.charAt(i));
			}
		}
		return count;
	}
}

