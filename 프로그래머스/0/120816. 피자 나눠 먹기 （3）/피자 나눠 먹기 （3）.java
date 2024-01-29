class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        // n을 slice로 나눠서 나머지가 없으면, 나눈 값 출력
        if(n % slice == 0) {
            answer = n / slice;
        }
        // 나머지가 있으면, 나눈값에 + 1판 추가
        else {
            answer = n / slice + 1;
        }
        return answer;
    }
}