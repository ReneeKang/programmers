import java.util.Scanner;

class Solution {
    
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        for(int i=1; i<=n; i++){
            answer[i-1] = (long)x*i;
        }
        return answer;
    }
    
    public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int n = sc.nextInt(); 
            Solution s = new Solution();
            s.solution(x,n);
            
        
        }
    
    
}