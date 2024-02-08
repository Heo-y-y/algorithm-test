import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // str에 s를 공백기준으로 대입
        String[] str = s.split("");
        // count 용
        int count = 0;
        
        // str을 오름차순 정렬
        Arrays.sort(str);
        
        // str을 돌면서 str[i]랑 str[j]가 같으면 count++;
        // count가 1이면 해당 i값 answer +=
        // 다시 count 0으로 초기화
        for(int i = 0; i < str.length; i++) {
            count = 0;
            for(int j = 0; j < str.length; j++) {
                if(str[i].equals(str[j])) {
                    count++;
                } 
            }
            if(count == 1) {
                answer += str[i];
            }
        }
        return answer;
    }
}