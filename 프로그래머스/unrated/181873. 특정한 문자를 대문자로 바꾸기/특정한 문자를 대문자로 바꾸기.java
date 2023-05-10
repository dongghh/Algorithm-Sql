class Solution {
    public String solution(String str, String alp) {
        String answer = "";
        
        char[] arr = str.toCharArray();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == alp.charAt(0) ){
                arr[i] = (char)(arr[i] - 32);
                answer = String.valueOf(arr);
            }else{
                answer = String.valueOf(arr);
            }
        }
         
        
        return answer;
    }
}