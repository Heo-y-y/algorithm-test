class Solution {
    public int solution(int n) {
        int answer = 0;
        //int n을 String으로 변환
        String s = Integer.toString(n); 
        
        for(int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i, i+1));
        }
        return answer;
    }
}