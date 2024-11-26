package LinkedList_Problem;

public class sliding_window_tachnec {
    //find firest kthe sume then substrack i-1 and add arr(i-k-1)
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, -2, -4};
        int n = arr.length;
        int k=3;
        int answer = sliding_window(arr,n,k);
        System.out.println(answer);


    }
    public static int sliding_window(int[] arr, int n ,int k){
        int answer =0;
        int min = Integer.MAX_VALUE;
        // now we have to find the minmum value of thee sum

        for(int i=0;i<k;i++){
            answer=answer+arr[i];
        }
        min =answer;
        for(int i=k;i<n-1;i++)
            answer =answer-arr[i]+arr[i-k];
        min = Math.min(min,answer);
            return min;
    }
    }

