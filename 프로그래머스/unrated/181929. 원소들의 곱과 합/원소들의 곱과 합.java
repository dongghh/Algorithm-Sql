class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int num = 0;
        
        for(int i = 0; i<arr.length; i++){
            answer *= arr[i];
            num += arr[i]; 
        }
        
        return answer < num*num ? 1 : 0;
    }
}