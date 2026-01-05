import java.util.*;
public class SetToSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of set elements");
        int len1 = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        System.out.println("Enter the elements of set");
        for(int i = 0; i < len1; i++){
            set.add(sc.nextInt());
        }

        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList);
    }

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list);                   
        return list;
    }
}
