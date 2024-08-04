package DP_JAVA;

import java.util.Arrays;

public class Lecture_2_Climing_Saters {
    public static void main(String[] args) {
        int n =50;




        System.out.println(countstarps(n));

    }
    public static int countstarps(int n  ){
        // how we solve the follwoing condition what we can do it
        if(n==0 || n==1){
            return 1;
        }
        int[] dp= new int[n+1];
        dp[0]=1;
        dp[1]=1;
       //  dp[n]=countstarps(n-1)+countstarps(n-2); by using recusion it will take very much time
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
