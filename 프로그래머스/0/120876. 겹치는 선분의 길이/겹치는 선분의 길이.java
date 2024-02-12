class Solution {
    public int solution(int[][] lines) {
        // -100 ~ 100 범위의 2차원 배열
        int[] rail = new int[200];
        
        // lines를 돌며 각 선의 범위에 해당하는 rail 배열의 위치에 1을 더함
        // 이를 통해 해당 위치에 선이 지나간 횟수를 파악
        for(int[] line : lines) {
            for(int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }
        
        // rail을 돌며 1인 경우 answer++
        int answer = 0;
        for(int value : rail) {
            if(value > 1) answer++;
        }
        return answer;
    }
}