class Solution {
    public String solution(String str, int[] arr) {
        String answer = "";
        
        for(int i = 0; i<arr.length; i++){
            answer += str.charAt(arr[i]);
        }
        
        return answer;
    }
}