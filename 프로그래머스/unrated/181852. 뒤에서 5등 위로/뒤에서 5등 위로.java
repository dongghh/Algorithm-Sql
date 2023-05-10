import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        Arrays.sort(num_list);
        for(int i = answer.length-1, j = 1; j<=answer.length; i-- , j++){
            answer[i] = num_list[num_list.length-j]; 
        }
        
        return answer;
    }
}