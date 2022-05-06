class Solution {
    public int[] solution(long n) {
        int[] answer = {};
          String s = n+"";
        // int tmp = (int);
      
        answer = new int[s.length()];
        for(int i=0,j=s.length()-1; i<s.length(); i++){
            answer[j--] = s.charAt(i) - '0';
      
            System.out.println(answer[i]);
        }
        
        
        
//         while(n!=0){
            
//             answer[i] = n%10;
//             n /= 10;
            
//             System.out.println(answer[i]);
//         }
        
        
        
        
        
        return answer;
    }
}