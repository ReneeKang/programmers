class Solution {
    public String solution(String s) {
        String answer = "";
        char [] cArr = s.toCharArray(); //문자를 char배열로 저장
        int size = cArr.length; 
        int index=0; //인덱스 카운트 변수
        char []nArr= new char[size]; // 저장할 배열
        for(int i=0; i<cArr.length; i++){ 
            if(index==0||index%2==0) { //인덱스 짝수일때
                    if('a'<=cArr[i]&&cArr[i]<='z') //소문자일때 -> 대문자로
                              nArr[i]=(char)(cArr[i]-32);
                    else nArr[i]=cArr[i]; // 대문자일때 그냥 출력
                     }
            else if(index==1||index%2==1) { //인덱스 홀수일때
                  if('A'<=cArr[i]&&cArr[i]<='Z') //대문자일때 -> 소문자로
                        nArr[i]=(char)(cArr[i]+32);
                    else nArr[i]=cArr[i]; //소문자일때 그냥 출력
                 }  
            index++; 
            System.out.print(nArr[i]+" ");  // 잘 저장되었는지 확인
            if(cArr[i]==' '){
                    index=0;
            }  
        }
        return new String(nArr);
    }
}