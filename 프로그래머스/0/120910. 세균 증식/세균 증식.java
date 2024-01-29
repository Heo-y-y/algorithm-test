class Solution {
    public int solution(int n, int t) {
        // n으로 초기화
        int answer = n;
        // t시간만큼 반복하며 2씩 곱한다.
        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }
        return answer;
    }
}