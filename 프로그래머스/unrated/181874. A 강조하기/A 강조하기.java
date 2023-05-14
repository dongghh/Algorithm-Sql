class Solution {
    public String solution(String str) {
        String answer = str.toLowerCase();
        answer = answer.replaceAll("a","A");
        return answer;
    }
}