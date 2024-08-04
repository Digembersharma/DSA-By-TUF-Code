package DP_JAVA;
import java.util.*;

public class Lecture_3_FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};

        int n=arr.length;
        // we have to find the minimum energy of frog whic is requiere'
        System.out.println(minimumEnergy(arr, n-1));

    }
    public static int  minimumEnergy( int[] arr , int index ){



        if(index==0){
            return 0 ;
        }
        int   left= minimumEnergy(arr,index-1)+Math.abs(arr[index-1]-arr[index]);
        if(index>1){
           int  right = minimumEnergy(arr,index-2)+Math.abs(arr[index-2]-arr[index]);
           return Math.min(left, right);
        }
        return  left;
    }
}
