class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            int r = numbers[numbers.length-1];
            answer[0] = r;
            
            for(int i = 1 , j = 0; i<numbers.length; i++){
                answer[i] = numbers[j];
                j++;
            }
        }else{
            int l = numbers[0];
            answer[numbers.length-1] = l;
            
            for(int i = 0, j = 1; i<numbers.length-1; i++){
                answer[i] = numbers[j];
                j++;
            }
        }
        
        return answer;
    }
}