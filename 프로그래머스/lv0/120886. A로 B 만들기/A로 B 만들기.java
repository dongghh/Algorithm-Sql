class Solution {
    public int solution(String before, String after) {
        int a = 0;
        int b = 0;
        
        for(int i = 0; i<before.length(); i++){
            a += before.charAt(i);
            b += after.charAt(i);
        }
        
        return (a == b) ? 1 : 0;
    }
}