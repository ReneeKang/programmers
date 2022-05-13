class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int cnt=0;
    
            for(int i=0; i<s.length(); i++){
                
                if(!('0'<= s.charAt(i) && s.charAt(i)<='9')){
                   return false;
                }//if  
            }
        
            if(s.length()==4||s.length()==6) {return true;}
        
        return false;
    }
}