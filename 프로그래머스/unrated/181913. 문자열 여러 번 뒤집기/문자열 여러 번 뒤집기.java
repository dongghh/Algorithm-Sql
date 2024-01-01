class Solution {
    public StringBuilder solution(String my_string, int[][] queries) {
        StringBuilder str = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1] + 1;
            
            StringBuilder sb = new StringBuilder(str.substring(start, end));
            sb.reverse();
            str.replace(start, end, sb.toString());
        }
        
        return str;
    }
}
