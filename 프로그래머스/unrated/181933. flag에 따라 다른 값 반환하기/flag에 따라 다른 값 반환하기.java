class Solution {
    public int solution(int a, int b, boolean flag) {
        //flag true => a+b;
        //flag false => a-b;
        return (flag == true) ? a+b : a-b;
    }
}