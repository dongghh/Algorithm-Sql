import java.util.*;
class Solution {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split("");
        Arrays.sort(arr);
        int cnt = 0;
        
        for(int i = 0; i<arr.length; i++){
            cnt = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer += arr[i];
            }
            
        }
        
        return answer;
    }
}