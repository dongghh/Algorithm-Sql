import java.util.*;
class Solution {
    public String solution(String str, int num1, int num2) {
        String answer = "";
        String s = "";
        String[] arr = str.split("");
        
        s = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = s;
        
        answer = String.join("",arr);
        
        return answer;
    }
}