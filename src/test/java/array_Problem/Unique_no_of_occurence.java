package array_Problem;
import java.util.*;

public class Unique_no_of_occurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(solution(arr));

    }
    public static boolean solution(int[] arr){

        // to check frequency count we use .value in hashmap not .get it give null value if frquent is zero or not present
        boolean answer = false;
        HashMap<Integer,Integer> hash = new HashMap<>();
        HashSet<Integer> hash2 = new HashSet<>();
        for(int num  : arr){
            hash.put(num , hash.getOrDefault(num,0)+1);



        }
        for(int n : hash.values()){
            if(!hash2.add(n)){
                return false;// because hashset not add duplicate value if not add means duplicat is present
            }
        }


        return true;// means we find unigue value
    }
}
