import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = n+"";
        String s1 = "";
        int[] tmp = new int[s.length()];
        // char [] tmp = s.toCharArray();
        for(int i=0; i<tmp.length; i++){
            tmp[i] = s.charAt(i)-'0';
            // System.out.println(tmp[i]);
            
        }

      for(int i=0; i<tmp.length; i++)
          for(int j=i+1; j<tmp.length; j++){
              if(tmp[i]<tmp[j]){
                  int t = tmp[j];
                  tmp[j] = tmp[i];
                  tmp[i] = t;
              }
          }
        
        
         for(int j=0; j<tmp.length; j++)
                     s1 += ""+tmp[j];
          
        // answer = Integer.parseInt(s1);
        answer = Long.valueOf(s1);
    // Long.valueOf(String.valueOf(tmp));
        return answer;
    }
}