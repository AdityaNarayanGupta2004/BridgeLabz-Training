import java.util.*;

public class WordSearchInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sentences = {
            "I love to code in Python",
            "Java is another programming language",
            "Python is great for data science",
            "Learning to code is fun"
        };
        String target = "java";

        String ans = searchWordInSentences(sentences, target);
        System.out.println("Result of searching is: \n" + ans);
    }
    public static String searchWordInSentences(String[] sentences, String targetWord) {
        // Iterate through each sentence in the array
        for (String sentence : sentences) {
            // Check if targetWord is in the current sentence (case-insensitive)
            if (sentence.toLowerCase().contains(targetWord.toLowerCase())) {
                return sentence;
            }
        }
        return "Not Found";
    }
}