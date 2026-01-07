import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class WordCounter{
    // main method
    public static void main(String[] args){
        String filePath = "input.txt";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine()) != null){
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");
                String[] words = line.split("\\s+");
                for(String word : words){
                    if(!word.isEmpty()){
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Error reading the file.");
            e.printStackTrace();
            return;
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        System.out.println("Top 5 most frequent words:");
        for(int i = 0; i < Math.min(5, sortedWords.size()); i++){
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
