class Solution {
    public int solution(int order) {
        int answer = 0;
        // order를 문자열로 변경
        String s = Integer.toString(order);
        
        // s를 돌며 각 문자가 369가 나오면 answer++
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9') {
                answer ++;
            }
        }
        return answer;
    }
}