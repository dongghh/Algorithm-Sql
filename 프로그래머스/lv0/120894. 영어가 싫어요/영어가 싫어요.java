class Solution {
    public long solution(String numbers) {
        
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i<num.length; i++){
            numbers = numbers.replaceAll(num[i],String.valueOf(i));
            //반복하면서 numbers안에 num[i]가 있으면 i로 치환
            //i는 int형 이므로 String.valueOf(i) String으로 바꿔줌
        }
        
        long answer = Long.parseLong(numbers);
        
        return answer;
    }
}