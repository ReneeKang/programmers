class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int xx = x;
        int tmp=0;
        while(x>0){
            tmp += x%10;
            x = x/10;   
        }
        if(xx%tmp==0) answer=true;
        else answer=false;
       
        
        return answer;
    }
}