package DP_JAVA;

public class Lecture_4_Jump_k_index {
    // in previous question we onnly jump first steps or two steps whatif we jump ksteps

    // lete think
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int n = arr.length;
        int k=4;
        System.out.println(k_minimum_steps(arr,k,n-1));
    }
    public static int k_minimum_steps(int[] arr , int k,int index){
        // what we have to solve the following question



            if(index==0) {
                return 0;}

            int min = Integer.MAX_VALUE;
                // what we have to solve the following question

                for (int j=1;j<=k;j++){
                        // llets think the apprichh to slve theis question
                        if (index - j>= 0) {
                            int jump = k_minimum_steps(arr, k, index - j) + Math.abs(arr[index] - arr[index - j]);
                            min = Math.min(jump, min);

                        }
                    }




        return min;
        }

    }

