class Solution {
    public int[][] solution(int[] num_list, int n) {
        // num_list의 값들을 n개씩 나눠 2차원 배열로 만들기 위해
        // 행은 num_list의 길이에서 n을 나누고, 열은 n으로 설정
        int[][] answer = new int[num_list.length / n][n];
        // num_list의 값을 설정할 index 초기화
        int index = 0;
        
        // num_list의 값을 2차원 배열 answer에 순서대로 넣는다.
        for(int i = 0; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }
        return answer;
    }
}