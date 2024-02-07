class Solution {
    public int solution(int n) {
        // Math.sqrt를 사용하여 제곱근을 구하고, 1로 나누어 정수인지 확인
        if(Math.sqrt(n) % 1 == 0) {
            return 1;
        }
        else {
            return 2;
        }
    }
}