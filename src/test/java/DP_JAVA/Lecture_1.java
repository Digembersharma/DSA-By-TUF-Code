package DP_JAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lecture_1 {
    public static void main(String[] args) {
        int n=6;// by using dp the time compelx cityy is O(n)
        int ans=0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        //int sum =  dpfabonachi(n,dp);
       // int sum=tabulation(n,dp);
        int sum=tabulation(n);
        System.out.println(sum);// time commplex city is 2^n
        // recuresion ( means the top down approch means start from n and the go to base case and go back and print thei

    }

    /*public static int dpfabonachi(int n, int[] dp){// memorise mathord

        if(n==1 || n==0){
            return n;

        }
        if(dp[n]!=-1){
            return dp[n];
        }
         dp[n]=dpfabonachi(n-1,dp)+dpfabonachi(n-2,dp);
        return dp[n];
    }*/

    // the tabolation mathord name sujest is botam  up
    public static int tabulation(int n){
             /* dp[0]=0;
              dp[1]=1;*/
// the third approch is
        int previous2=0;
        int previous=1;
            for(int i=2;i<n+1;i++){
                int currenti=previous+previous2;
                  previous2=previous;
                  previous=currenti;
              //  dp[i]=dp[i-1]+dp[i-2];
            }
            return previous;// this will give answer without stack space
        // in this code the time complexcity is O(n) the space complexcity is 0 we do not required an extra space
    }
}
