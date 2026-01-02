import java.util.*;
public class SentenceFormatter {
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a Paragraph");
        String string = sc.nextLine();

        String ans = SentenceFormatter.formatSentence(string);
        System.out.println("Formatted Pargraph is:");
        System.out.println(ans);
    }
    // creating a method
    public static String formatSentence(String str){

    if(str == null || str.isEmpty()){
        return str;
    }

    StringBuilder sb = new StringBuilder();
    boolean capital = true;
    boolean spaceAllowed = false;

    for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);

        if(Character.isWhitespace(ch)){
            if(spaceAllowed) {
                sb.append(' ');
                spaceAllowed = false;
            }
            continue;
        }

        if(capital && Character.isLetter(ch)){
            sb.append(Character.toUpperCase(ch));
            capital = false;
        }else {
            sb.append(ch);
        }

        if(ch == '.' || ch == '?' || ch == '!'){
            capital = true;
            spaceAllowed = true;
        }else {
            spaceAllowed = true;
        }
    }
    return sb.toString().trim();
    }
}
