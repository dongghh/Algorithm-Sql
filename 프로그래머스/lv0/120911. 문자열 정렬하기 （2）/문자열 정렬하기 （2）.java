import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i].toLowerCase();
        }
        
        Arrays.sort(arr);
        
        String answer = String.join("",arr); 
    
        return answer;
    }
}