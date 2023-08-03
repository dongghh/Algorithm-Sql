import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer;
        
        String[] arr = my_string.split("");
        
        for(int i = 0; i<indices.length; i++){
            int j = indices[i];
            arr[j] = "";
        }
        
        return answer = String.join("",arr);
    }
}