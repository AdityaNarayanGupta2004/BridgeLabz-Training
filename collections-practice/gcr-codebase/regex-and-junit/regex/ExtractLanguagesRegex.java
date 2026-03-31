import java.util.*;
import java.util.regex.*;
public class ExtractLanguagesRegex {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> result = extractLanguages(text);
        System.out.println(String.join(", ", result));
    }
    
    public static List<String> extractLanguages(String text) {
        String regex = "\\b(Java|Python|JavaScript|C\\+\\+|C#|Go|Ruby|PHP)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> found = new ArrayList<>();
        while(matcher.find()){
            found.add(matcher.group());
        }
        return found;
    }
}
