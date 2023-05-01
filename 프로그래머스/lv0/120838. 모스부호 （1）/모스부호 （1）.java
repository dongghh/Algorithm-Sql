class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] l = letter.split(" ");
        String[] morse ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s : l){
            for(int i = 0; i<morse.length; i++){
                if(s.equals(morse[i])){
                    answer += (char)(i + 97);
                }
            }
        }
        
        
        return answer;
    }
}