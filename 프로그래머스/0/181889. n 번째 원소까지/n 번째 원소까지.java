class Solution {
    public int[] solution(int[] num_list, int n) {
        // n으로 길이 초기화
        int[] answer = new int[n];
        
        // i~n을 돌며 answer에 대입
        for(int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}