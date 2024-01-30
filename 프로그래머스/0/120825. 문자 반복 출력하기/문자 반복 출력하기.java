class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // 문자열만큼 돌면서
        for(int i = 0; i < my_string.length(); i++) {
            // 반복 수만큼 i를 추가
            for(int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}