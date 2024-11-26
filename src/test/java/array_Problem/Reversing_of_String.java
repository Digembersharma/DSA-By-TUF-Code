package array_Problem;
import java.util.*;

public class Reversing_of_String {
    public static void main(String[] args) {
        String str = "hello";
        // we have to revese the string vowel
        System.out.println(answer(str));
    }
    public static String answer(String str){
        int start =0;
        int last = str.length()-1;
        char[] ch = str.toCharArray();
        while(last>start){
          if(!isVowel(ch[start])){
              start++;
          }
          else if(!isVowel(ch[last])){
              last--;
          }
            else{
              char temp = ch[start];
              ch[start] = ch[last];
              ch[last] = temp;
              start++;
              last--;
          }
        }
        return  new String(ch);
    }
    public static boolean isVowel(char ch){

             if(ch=='a' || ch=='e' || ch=='i' || ch =='o' ||ch=='u' || ch=='A' || ch=='E' || ch =='I' || ch =='O' || ch=='U' ){
                 return true;

         }
        return false;
    }
}
