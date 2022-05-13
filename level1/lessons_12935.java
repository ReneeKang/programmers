import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};  
        answer = new int[arr.length-1];
        
        if(arr.length<=1) return new int[]{-1};
        
        int min = arr[0];
            for(int i=0; i<arr.length-1; i++){
                    if(min>arr[i+1]){
                        min=arr[i+1];
                        //System.out.println(min);
                    }
            }
           
        
            for(int i=0, j=0; i<arr.length; i++){
                if(min!=arr[i]){
                    // System.out.println(arr[i]);
                   answer[j++] = arr[i];
                }
            }
        
      
         // for(int i=0; i<arr.length; i++){
         //        System.out.print(arr[i]+" ");
         //    }
        
        return answer;
    }
}