class Solution {
    public String solution(String str) {
        String answer = "";
        
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '0'){
                answer = Integer.toString(Integer.parseInt(str));
                break;
            }else{
                answer = str;
                break;
            }
        }
        
        return answer;
    }
}