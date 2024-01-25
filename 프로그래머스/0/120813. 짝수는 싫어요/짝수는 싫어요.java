import java.util.Arrays;


class Solution {
    public int[] solution(int n) {
        // n이 홀수, 짝수일 경우를 고려
        int[] answer = new int[(n + 1) / 2];
        
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                // i가 1이면 0번째에 1이 들어감
                answer[i / 2] = i;
            } 
        }
        return answer;
    }
}