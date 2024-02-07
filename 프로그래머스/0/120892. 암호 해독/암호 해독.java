class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // 0번째를 감안하여 i를 code-1로 설정
        // code ~ cipher를 돌며 i += code
        for(int i = code -1; i < cipher.length(); i += code) {
                answer += cipher.charAt(i);
        }
        return answer;
    }
}