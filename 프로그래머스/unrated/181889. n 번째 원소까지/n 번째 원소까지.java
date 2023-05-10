class Solution {
    public int[] solution(int[] list, int n) {
        int[] answer;
        int j = 0;
        if(n == 1){
            answer = new int[1];
            for(int i = 0; i<= answer.length-1; i++){
                answer[i] = list[j];
                j++;
            }
        }else{
            answer = new int[n];
            for(int i = 0; i< answer.length; i++){
                answer[i] = list[j];
                j++;
            }
        }
               
            
        return answer;
    }
}