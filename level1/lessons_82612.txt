import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum=0;
        
        
        for(int i=1; i<=count; i++){
            
            sum += i * price;
            
        System.out.println("sum="+sum);
        }
        
        
//         if(money<sum)
//              answer = (long)(Math.abs(money-sum));
       
//         else answer = 0;
        
       answer =  money<sum? sum-money : 0;
        
        return answer;
    }
}