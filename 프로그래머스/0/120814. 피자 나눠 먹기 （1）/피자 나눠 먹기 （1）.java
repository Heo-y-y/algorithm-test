class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 제한사항 필터링
        if (n >= 1 && n <= 100) {
            // 7로 나누어 지는 수 
            if (n % 7 == 0) {
                answer = n / 7;
            }
            // 나누어 떨어지지 않으면, 1판 추가
            else {
                answer = n / 7 + 1;
            }
        }
        return answer;
    }
}