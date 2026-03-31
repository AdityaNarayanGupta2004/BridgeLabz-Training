import java.util.*;

public class UnionAndIntersectionOfTwoSet {

    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        for(Integer a : set1) {
            union.add(a);
        }
        for(Integer b : set2) {
            boolean exists = false;
            for(Integer u : union) {
                if (u.equals(b)) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                union.add(b);
            }
        }

        return union;
    }

    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();
        for(Integer a : set1) {
            for(Integer b : set2){
                if(a.equals(b)){
                    intersection.add(a);
                    break;
                }
            }
        }

        return intersection;
    }

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
        Set<Integer> unionResult = findUnion(set1, set2);
        Set<Integer> intersectionResult = findIntersection(set1, set2);

        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}
