class Solution {
    public String solution(String my_string, String letter) {
        String old = my_string;
        String answer = old.replaceAll(letter,"");
        return answer;
    }
}