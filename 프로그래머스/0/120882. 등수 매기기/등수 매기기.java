class Solution {
    public int[] solution(int[][] score) {
        // 점수 계산용
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];
        
        // score을 돌며 avg에 평균 값 할당
        for(int i = 0; i < score.length; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        // avg를 돌며 등수 할당
        for(int i = 0; i < avg.length; i++) {
            int rank = 1;
            for(int j = 0; j < avg.length; j++) {
                if(avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}