import java.util.*;
class Solution {
    public String solution(String str) { 
        char[] arr = str.toCharArray();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 97 && 122 >= arr[i]){
                arr[i] = (char)(arr[i] - 32);
            }else if(arr[i] >= 65 && 90 >= arr[i]){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        String answer = String.valueOf(arr);
        return answer;
    }
}