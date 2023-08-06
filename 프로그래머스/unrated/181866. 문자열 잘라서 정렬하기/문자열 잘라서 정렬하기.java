import java.util.*;
class Solution {
    public List solution(String myString) {
        String[] answer = myString.trim().split("x");
        
        Arrays.sort(answer);
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i<answer.length; i++){
            if(!answer[i].isEmpty()){
                arr.add(answer[i]);
            }
        }
        
        return arr;
    }
}