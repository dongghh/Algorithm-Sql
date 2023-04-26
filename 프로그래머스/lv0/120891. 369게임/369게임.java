class Solution {
    public int solution(int o) {
        int answer = 0;
        String order = Integer.toString(o);
        String[] word = order.split("");
        for(int i = 0; i<word.length; i++){
            if(word[i].equals("3") || word[i].equals("6") || word[i].equals("9") ){
                answer ++;
            }
        }
        return answer;
    }
}