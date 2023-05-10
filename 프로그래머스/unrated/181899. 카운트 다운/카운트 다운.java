class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int j = 0;
        for(int i= start; end<=i; j++){
            answer[j] = i;
            i--;
        }
        
        return answer;
    }
}