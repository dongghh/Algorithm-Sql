class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        // 길이와 값 둘 다 포함 비교는 길이 -> 값 순으로 
        //arr2가 크면 -1 
        //arr1이 크면 1
        // 같으면 0
        
        if(arr1.length != arr2.length){ // 길이가 다를 때
            if(arr1.length > arr2.length){
                answer = 1;
            }else{
                answer = -1;
            }
        }else{ // 길이가 같을 때
            int num_arr1 = 0;
            int num_arr2 = 0;
           for(int i = 0; i<arr1.length; i++){
               num_arr1 += arr1[i];
               num_arr2 += arr2[i];
           }
            if(num_arr1 > num_arr2){
                answer = 1;
            }else if(num_arr1 < num_arr2){
                answer = -1;
            }
        }
        
        return answer;
    }
}