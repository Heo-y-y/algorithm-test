class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        // 살 수 있는 개수
        answer[0] = money / 5500;
        // 남은 돈
        answer[1] = money % 5500;
    
        return answer;
    }
}