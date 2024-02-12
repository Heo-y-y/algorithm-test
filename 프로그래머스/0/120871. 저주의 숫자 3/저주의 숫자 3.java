class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 돌며 3인 경우 answer를 한 번 더 넘김
        for(int i = 0; i < n; i++) {
            answer ++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer ++;
            }
        }
        return answer;
    }
}