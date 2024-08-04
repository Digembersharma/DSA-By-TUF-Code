package DP_JAVA;

public class Lecture_21_Target_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int target = 3;
        int index = arr.length;
        String str = "";
        System.out.println(target(arr, target, index - 1, str, 0));
    }

    public static int target(int[] arr, int target, int index, String str, int sum) {
        // Base case: if we've considered all elements
        if (index < 0) {
            // Check if the current sum equals the target
            return sum == target ? 1 : 0;
        }

        // Include the current element
        int include = target(arr, target, index - 1, str + "+" + arr[index], sum + arr[index]);

        // Exclude the current element
        int exclude = target(arr, target, index - 1, str + "-" + arr[index], sum);

        // Return the total count of ways to reach the target
        return include + exclude;
    }// the code when we use dp here the in this code the time complexctiy is 
}