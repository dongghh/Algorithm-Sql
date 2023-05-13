class Solution {
    public int solution(String str, String pat) {
        return str.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}