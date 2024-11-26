package array_Problem;

public class flower_problem {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n=3;
        System.out.println(answer(arr,n));

    }
    public static boolean answer(int[] arr, int n){
        boolean right =false;

        for(int i=0;i<arr.length;i++){
            if((arr[i]==0)&&(arr[i-1]==0 || i==0)&&(arr[i+1]==0 || i==n-1)){
               // think about the condition in all the coming starting of all the coming to al the coming in the
                right = true;
                n--;
            }

        }
        if(n==0){
            if(right){
                return true;
            }
        }

        return false;
    }
}
