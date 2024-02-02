class Solution {
    public int[] solution(int[] emergency) {
        // emergency 길이로 초기화
        int[] answer = new int[emergency.length];
        
        // i보다 응급도가 높은 값이 있으면 i++
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            // 순서이기 때문에 0이 아닌 1부터 나타내기 위해
            // 배열의 모든값 ++
            answer[i]++;
        }
        return answer;
    }
}