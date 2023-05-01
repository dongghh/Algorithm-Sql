class Solution {
    public String solution(int age) {
        // 아스키코드 이용 
        // A = 65
        // a = 97
        String answer = "";
        String[] arr = Integer.toString(age).split("");
        
        for(int i = 0; i<arr.length; i++){
            answer += ((char)(Integer.parseInt(arr[i])+ 97));
        }
        
        return answer;
    }
}