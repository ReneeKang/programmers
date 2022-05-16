class Solution {
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        
       // System.out.println(cArr);
        
        
        for(int i=0; i<cArr.length; i++)
            for(int j=0; j<cArr.length-1-i; j++)
                if(cArr[j]<cArr[j+1]){
                    char tmp=cArr[j];
                    cArr[j] = cArr[j+1];
                    cArr[j+1] = tmp;
                }
        
        for(char c : cArr)
            answer+=c;
        
        
        System.out.println(cArr);
             
       
        return answer;
    }
}