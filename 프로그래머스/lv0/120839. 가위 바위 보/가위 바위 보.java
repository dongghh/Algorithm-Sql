class Solution {
    public String solution(String rsp) {
        // 가위 2
        // 바위 0
        // 보 5
        String answer = "";
        
        String[] a = rsp.split("");
        
        for(int i = 0; i<a.length; i++){
            if(a[i].equals("2")){
                answer += "0";
            }else if(a[i].equals("0")){
                answer += "5";
            }else if(a[i].equals("5")){
                answer += "2";
            }
        }
        return answer;
    }
}