class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // my_string의 0~s까지 answer에 대입
        // 그다음 overwrite_string을 answer에 더함
        // 그다음 s에 overwrite_string의 길이를 더한 값부터 my_string의 길이까지 더함
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        
        return answer;
    }
}