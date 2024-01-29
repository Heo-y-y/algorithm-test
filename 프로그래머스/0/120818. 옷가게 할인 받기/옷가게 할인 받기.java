class Solution {
    public int solution(int price) {
        int answer = 0;
        
        // 50만원 이상 20% 할인
        if(price >= 500000) {
            answer = (int) (price * 0.8);
        } 
        // 30만원 이상 10% 할인
        else if(price >= 300000) {
            answer = (int) (price * 0.9);
        }
        // 10만원 이상 5% 할인
        else if(price >= 100000) {
            answer = (int) (price * 0.95);
        // 나머지 할인 X
        } else {
            answer = price;
        }
        return answer;
    }
}