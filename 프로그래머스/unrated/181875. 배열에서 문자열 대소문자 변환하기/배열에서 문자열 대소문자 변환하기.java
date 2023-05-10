class Solution {
    public String[] solution(String[] arr) {
        String[] answer = new String[arr.length];

        for(int i = 0; i<answer.length; i++){
            if(i % 2 == 0){
                answer[i] = arr[i].toLowerCase();
            }else{
                answer[i] = arr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}