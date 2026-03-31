import java.util.*;
public class BookPriceMergeSorting {
    // main function
    public static void main(String[] args) {
        int[] prices = {500, 1, 900, 64, 8979, 546, 2, 45, 0};
        System.out.println("Original Book Prices: ");
        printArray(prices);
        int ans[] = sort(prices, 0, prices.length - 1);
        System.out.println("Sorted Book Prices (Ascending): ");
        printArray(ans);
    }

    // Recursively divides the array and sorts each half
     public static int [] sort(int arr[],int strt,int end){
        if(strt == end){  //base condition
            int a[] = new int[1]; // initialize the array at base condtion
            a[0] = arr[strt];
            return a;
        }
        int mid = strt + (end - strt)/2;
        int a1[] = sort(arr,strt,mid);
        int a2[] = sort(arr,mid+1,end);
        return merge(a1,a2);//merging of two arrays
    }

    // Merges two sorted subarrays into a single sorted segment
     public static int [] merge(int arr1[],int arr2[]){
        List<Integer> l = new ArrayList<>();
        int i = 0,j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                l.add(arr1[i]);
                i++;
            }
            else{
                l.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length){
            l.add(arr1[i++]);
        }
        while(j < arr2.length){
            l.add(arr2[j++]);
        }
        int ans[] = new int[l.size()];
        for(int k = 0; k < l.size(); k++){
            ans[k] = l.get(k);
        }
        return ans;
    }
    
    // Prints the elements of the array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
