import java.util.*;

public class ComparingTwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of set1 elements");
        int len1 = sc.nextInt();
        System.out.println("Enter a length of set2 elements");
        int len2 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Enter the elements of set1");
        for(int i = 0; i < len1; i++){
            set1.add(sc.nextInt());
        }

        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter the elements of set2");
        for(int i = 0; i < len2; i++){
            set2.add(sc.nextInt());
        }
        boolean result = areSetsEqual(set1, set2);
        System.out.println("Are the sets are equal " + result);
    }

    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}
