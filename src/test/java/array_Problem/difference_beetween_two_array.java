package array_Problem;
import java.util.*;

public class difference_beetween_two_array {
    public static void main(String[] args) {
        // list of list to solve this what we can do in the coming state
         int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

    }
    public static List<List<Integer>> answer(int[] num1, int[] num2){

        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> hash2= new HashSet<>();
        for(int val : num1){
            hash.add(val);
        }
        for(int val2 : num2){
            hash2.add(val2);
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int val : num2){
            if(hash.contains(val)==false){
                set1.add(val);
            }
        }
        for(int val1 : num1){
            if(hash2.contains(val1)==false){
                set2.add(val1);
            }
        }
        return Arrays.asList(new ArrayList<>(set1),new ArrayList<>(set2));
    }
}
