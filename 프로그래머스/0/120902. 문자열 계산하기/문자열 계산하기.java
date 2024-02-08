import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // s배열로 변환
        String[] s = my_string.split(" ");
        
        // answer에 s의 0번째 초기화
        answer = Integer.parseInt(s[0]);
        
        // 1~s를 돌며 +면 다음값이랑 더하고, -이면 다음값이랑 뺀다.
        for(int i = 1; i < s.length - 1; i++) {
            if(s[i].equals("+")) {
                answer += Integer.parseInt(s[i + 1]);
            }
            else if(s[i].equals("-")) {
                answer -= Integer.parseInt(s[i + 1]);
            }
        }
            
        return answer;
    }
}