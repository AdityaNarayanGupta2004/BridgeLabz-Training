import java.util.*;
public class TextAnalyzer {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();
        // calling a function
        analyzeText(paragraph);

        System.out.println("Enter word to replace:");
        String oldWord = sc.nextLine();

        System.out.println("Enter new word which is to be replace:");
        String newWord = sc.nextLine();

        String updated = replaceWord(paragraph, oldWord, newWord);

        System.out.println("Updated Paragraph is :");
        System.out.println(updated);

        sc.close();
    }

    public static void analyzeText(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println(" Paragraph is empty or havong only spaces.");
            return;
        }

        text = text.trim();
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String[] words = text.split(" ");

        int wordCount = words.length;

        String longestWord = "";

        for (String word : words) {
            String cleanWord = "";
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    cleanWord += c;
                }
            }
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equalsIgnoreCase(oldWord)) {
                result.append(newWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
