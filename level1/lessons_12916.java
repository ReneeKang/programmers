class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCnt=0;
        int yCnt=0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        char[]cArr = s.toCharArray();        
        
        for(int i=0; i<s.length(); i++){
            if(cArr[i] == 'p'|| cArr[i] == 'P') pCnt++; 
            if(cArr[i] =='y'|| cArr[i] =='Y') yCnt++;
        }
        if(pCnt==yCnt) answer=true;
        else answer=false;
        
        

        return answer;
    }
}