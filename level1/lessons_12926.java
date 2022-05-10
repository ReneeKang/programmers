class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] cArr = s.toCharArray();
    
       
        for(int i=0; i<cArr.length; i++){
            
            if(cArr[i]==' ') cArr[i] =' ';
            
            else if(cArr[i]+n>'z'){
                System.out.println(cArr[i]);
                cArr[i] = (char)((cArr[i]+n)-'z'+'a'-1);
            } 
            else if(cArr[i]+n>'Z'&& ( 'A'<=cArr[i] &&cArr[i]<='Z'   )){
                System.out.println(cArr[i]);
                cArr[i] = (char)((cArr[i]+n)-'Z'+'A'-1);
            }
            else 
            cArr[i] = (char)(cArr[i] + n);         
             
        }
       
        return String.valueOf(cArr);
    }
}