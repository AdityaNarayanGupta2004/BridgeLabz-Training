public class CensorRegex {
    public static void main(String[] args){
        String text = "This is a damn bad example, bastard with some stupid and shit words.";
        System.out.println(censorSentence(text));
    }
    public static String censorSentence(String sentence){
        String regex = "(?i)\\b(damn|stupid|bastard|shit)\\b";
        return sentence.replaceAll(regex, "****");
    }
}