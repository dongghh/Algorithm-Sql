class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        
        int top = (denom1*numer2)+(denom2*numer1); // 분자 
        int bottom = denom1 * denom2; // 분모 
        int cl = 0;
            
        for(int i = 1; i<=top && i<=bottom; i++){
            if(top%i==0 && bottom%i==0)
                cl = i;
        }
            
        answer[0] = top/cl;
        answer[1] = bottom/cl;
            
        return answer;
    }
}