import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = n+"";
        int[] nn = new int[s.length()];
        for(int i=0; i<nn.length; i++){
            nn[i] = s.charAt(i)-'0';
            answer += nn[i];
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}