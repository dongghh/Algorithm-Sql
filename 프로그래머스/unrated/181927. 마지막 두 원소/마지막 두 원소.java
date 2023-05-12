class Solution {
    public int[] solution(int[] num) {
        int[] answer = new int[num.length + 1];
        
        for(int i = 0; i<num.length; i++){
            answer[i] = num[i];
        }
        
        if(num[num.length-1] > num[num.length-2]){
            answer[num.length] = num[num.length-1] - num[num.length-2];
        }else{
            answer[num.length] = num[num.length-1] * 2;
        }
        
        
        return answer;
    }
}