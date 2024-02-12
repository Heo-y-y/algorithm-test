class Solution {
    public int solution(int a, int b) {
        // 최대 공약수로 b를 나눈 값을 newB에 할당
        int newB = b / gcd(a, b);
        
        // newB가 1이 되면 탈출
        while(newB != 1) {
            // 2로 나눠지면 2로 나눔
            if(newB % 2 == 0) {
                newB /= 2;
            }
            // 5로 나눠지면 5로 나눔
            else if(newB % 5 == 0) {
                newB /= 5;
            }
            // 2와 5로 나눌 수 없으면 무한소수
            else {
                return 2;
            }
        }
        return 1;
    }
    
    // 유클리드호제법: 두 수의 최대 공약수 구하는 공식
    private int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
}