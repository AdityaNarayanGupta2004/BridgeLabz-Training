import java.util.*;

public class RemoveDuplicatesFromList{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length");
        int len = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i =0 ; i < len; i++){
            list.add(sc.nextInt());
        }
        List<Integer> ans = removeDuplicates(list);
        System.out.println("Output: " + ans);
    }
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}
