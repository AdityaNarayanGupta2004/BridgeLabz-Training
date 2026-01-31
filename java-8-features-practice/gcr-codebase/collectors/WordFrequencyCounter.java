package collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String paragraph = "Java is powerful. Java is versatile. Streams in Java are amazing.";
		 String[] words = paragraph.toLowerCase()
                 .replaceAll("[^a-zA-Z ]", "") // remove punctuation
                 .split("\\s+");
		 
		 // Count word frequency using Collectors.toMap()
	     Map<String, Integer> wordCount = Arrays.stream(words)
	            .collect(Collectors.toMap(
	                word -> word,        // key: the word
	                word -> 1,           // initial count = 1
	                Integer::sum         // sum counts for duplicates
	            ));

	        wordCount.forEach((word, count) -> 
	            System.out.println(word + ": " + count)
	        );
	}
}

