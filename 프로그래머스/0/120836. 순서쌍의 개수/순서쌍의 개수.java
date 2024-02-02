class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1~n까지 i로 나눈 나머지가 0이면 answer++
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}