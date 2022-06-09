class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] x = {1,2,3,4,5};
        int[] y = {2,1,2,3,2,4,2,5};
        int[] z = {3,3,1,1,2,2,4,4,5,5};
        int[] count= new int[3];
        
    
        //각각맞힌갯수
        for(int i=0; i<answers.length; i++){
            if(answers[i] == x[i%5]) count[0]++; 
            if(answers[i] == y[i%8]) count[1]++;
            if(answers[i] == z[i%10]) count[2]++;
        }
        
        //최고점
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        
        
        int cnt =0;
        //max 점수가진 사람 수
        for( int num : count)                                     
        if(max == num) cnt++;
        
        //사람수만큼 배열만들어서
        answer = new int[cnt];
        
        int index=0;
        for(int i=0;i < 3;i++){
            if(count[i] != max) continue;
            
                answer[index++] = i+1;
        }
        
        
        return answer;
    }
}

//12345

//21232425

//3311224455