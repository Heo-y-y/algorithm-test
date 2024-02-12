class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // 시작점
        int start = (total / num) - ((num - 1) / 2);
        
        // num을 순회하며, start++
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start ++;
        }
        return answer;
    }
}