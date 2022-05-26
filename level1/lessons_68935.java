import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> tmp = new ArrayList<>();
        
       //3진법으로  마지막몫+나머지들..
        while(true){
            if(n<3){
                tmp.add(n); break;
            }
            
            tmp.add(n%3);
            n/=3;
        }
        for(int i : tmp)
        System.out.print(i+" ");
    
        
        for(int i=0; i<tmp.size(); i++){
            answer += (Math.pow(3,tmp.size()-i-1)*tmp.get(i));
        }
        
        return answer;
    }
}

