class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = my_string.replaceAll("[a-z|A-Z]","");
        String[] numArray = num.split("");
        int[] newArray = new int[numArray.length];
        
        for(int i = 0; i<newArray.length; i++){
            newArray[i] = Integer.parseInt(numArray[i]);
        }
        
        for(int i = 0; i<newArray.length; i++){
            answer += newArray[i];
        }
        return answer;
    }
}