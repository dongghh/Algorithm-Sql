class Solution {
    public int solution(String message) {
        int answer = 0;
        char[] word;
        word = message.toCharArray();
        answer = word.length*2;
        return answer;
    }
}