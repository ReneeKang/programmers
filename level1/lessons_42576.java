import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//         for(String s : participant)
//                  System.out.print(s+" ");
//         System.out.println();
        
//          for(String s : completion)
//                  System.out.print(s+" ");
        
        int i=0;
        for(i=0; i<completion.length; i++){
            
            if(!participant[i].equals(completion[i])){
                 System.out.print("answer="+participant[i]);
                 break;    
            }//if 
        }//for    
         return participant[i];   
    }
}