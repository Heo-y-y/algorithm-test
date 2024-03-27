class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            
            String reverse = new StringBuilder(sb.substring(start, end + 1)).reverse().toString();
            
            sb.replace(start, end + 1, reverse);
        }
        return sb.toString();
    }
}