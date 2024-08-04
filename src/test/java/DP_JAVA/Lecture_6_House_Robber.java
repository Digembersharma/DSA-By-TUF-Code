package DP_JAVA;
import java.util.*;

public class Lecture_6_House_Robber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7,  3, 2, 9};
        int n = arr.length;

        // If there's oly one house, return its value
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        // Calculate the maximum money that can be robbed in two scenarios:
        // 1. Excluding the last house
        // 2. Excluding the first house
        int maxRobbedExcludingLast = houseRobber(arr, 0, n - 2);
        int maxRobbedExcludingFirst = houseRobber(arr, 1, n - 1);

        // The result is the maximum of the two scenarios
        int result = Math.max(maxRobbedExcludingLast, maxRobbedExcludingFirst);
        System.out.println(result);
    }

    // This method calculates the maximum amount of money that can be robbed
    // from a linear array of houses from start index to end index
    public static int houseRobber(int[] arr, int start, int end) {
        int prev1 = 0; // Max money robbed up to the previous house
        int prev2 = 0; // Max money robbed up to the house before the previous one

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}