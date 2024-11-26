package array_Problem;
import java.util.*;

public class String_comparrison {
    public static void main(String[] args) {
        char[] ch ={'a','a','b','b','c','c','c'};
        System.out.println(answer(ch));


    }
    public static int answer(char[] ch){

        StringBuilder str = new StringBuilder();
        /*HashMap<Character,Integer> hash = new HashMap<>();
        for(int i=0;i<ch.length-1;i++){
             hash.put(ch[i], hash.getOrDefault(ch[i],0)+1);

        }
       for(Map.Entry<Character,Integer> map : hash.entrySet()){
           str.append(map.getKey());
           str.append(map.getValue());
       }
        return str.toString().trim().length();*/// this is remover start and end space
        //

          int i=0;
          int n = ch.length-1;
          while(i<=n){
              int count =0;
              char cha = ch[i];
              while(i<ch.length&&ch[i]==cha){
                  count++;
                  i++;
              }
              str.append(cha);
              str.append(count);
          }
        return str.toString().trim().length();
    }

}
