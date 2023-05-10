class Solution {
    public int solution(String str) {
        int answer = 0;
        
        int[] arr = new int[str.length()];
        
        for(int i = 0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0';
        }
        
        for(int i = 0; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}