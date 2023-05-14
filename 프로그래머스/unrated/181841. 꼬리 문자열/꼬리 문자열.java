class Solution {
    public String solution(String[] str, String ex) {
        String answer = "";
        
        for(int i = 0; i<str.length; i++){
            if(str[i].contains(ex)){
                str[i] = "";
            }
        }
        
        answer = String.join("",str);   
        
        return answer;
    }
}