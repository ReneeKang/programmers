import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        
        Arrays.sort(d);
      
        for(int i=0; i<d.length; i++){
            sum+=d[i];
            if(sum>budget)
                break;
            answer++;
        }
        
        
        
        return answer;
    }
}


//최대한 많은 부서의 물품을 구매해 줄 수 있도록