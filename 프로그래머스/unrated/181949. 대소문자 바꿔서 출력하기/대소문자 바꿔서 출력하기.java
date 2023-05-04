import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 97 && 122 >= arr[i]){ // 소문자일 경우
                arr[i] = (char)(arr[i] - 32);
            }else if(65 <= arr[i] && arr[i] <= 90){ // 대문자일 경우
                arr[i] = (char)(arr[i] + 32);
            }
            
        }    
        System.out.println(arr);
    }
    
}