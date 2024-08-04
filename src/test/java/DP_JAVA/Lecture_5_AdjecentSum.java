package DP_JAVA;

import java.util.Arrays;

public class Lecture_5_AdjecentSum {
    // we have to find the adjecent sum of the given number
    public static void main(String[] args) {
        int[] arr ={2,1,4,9};
        int n= arr.length;
        int[]  dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(recursive(arr, n-1,dp));

    }
    public static int recursive(int[] arr,int index,int[] dp){
        int max = Integer.MIN_VALUE;
        // what we have to find the solution iin the states as we can do it lets solve the problme
        if(index==0){
            return arr[index];
        }
        if(index<0){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];// the time complex city is about 2^n wich is very hye complex coty how to solve this question in time comppler in n
        }
        // inprvious case we only add dp[idex] on this we get e 2 onlt not pased 9 we apply arr[index]
           int pooled =  arr[index]+recursive(arr, index-2,dp);// this is memorisation approch
         int not_pooled = 0 + recursive(arr,index-1,dp);
        dp[index] = Math.max( pooled, not_pooled);
        return dp[index];
        //in tabulation we find only use for loop instead of recurssion system in the

     }
      
}
