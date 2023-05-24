class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] arr = new int[number.length()];
        
        for(int i = 0 ; i<number.length(); i++){
            arr[i] = number.charAt(i) - '0';
        }
        
        for(int i = 0 ; i<arr.length; i++){
            answer += arr[i];
        }
        
        return answer%9;
    }
}