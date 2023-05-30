import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        //n을 String으로 변환
        
        String[] arr = str.split("");
        Arrays.sort(arr);
        //String으로 변환한 값을 배열에 넣음
        
        String[] arr1 = new String[arr.length];
        //arr1배열 생성
        
        for(int i = 0; i<arr.length; i++){
            arr1[i] = arr[arr.length-i-1]; 
        }
        //arr배열을 arr1배열에 거꾸로 넣음 
        
        String str1 = String.join("",arr1);
        //arr1배열을 다시 String으로
        
        answer = Long.parseLong(str1);
        //String으로 바꾼 값을 Long으로 형변환 끗.!
        
        return answer;
    }
}