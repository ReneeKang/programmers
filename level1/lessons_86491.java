class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        System.out.println("sizes.length=" + sizes.length);
        System.out.println("sizes[0].length=" + sizes[0].length);
        
        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length-1; j++){
                if(sizes[i][j]>sizes[i][j+1]){
                    int tmp = sizes[i][j];
                    sizes[i][j] = sizes[i][j+1];
                    sizes[i][j+1] = tmp;
                }//if
                 
            }// for j
        }//for i
        
        
        
        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length; j++){
                  System.out.print(sizes[i][j]+" ");
            }
            System.out.println();
        }
        
    
        
        int w=0; int h=0;
        
        for(int i=0; i<sizes.length; i++){
           if(w<sizes[i][0])
               w =sizes[i][0];
        }   
        
        for(int i=0; i<sizes.length; i++)
              if(h<sizes[i][1]){
                  h = sizes[i][1];
                }
        
        System.out.println("w="+w +" h="+h );
        answer = w*h;
        
        
        return answer;
    }
}