class Solution {
    public int solution(int[] numbers, int k) {
        // 1부터 시작하기 때문에 1로 초기화
        int answer = 1;
        
        // 1~k번째를 반복하며, 건너뛰기 위해 answer에 2씩 더한다.
        for(int i = 1; i < k; i++) {
            answer += 2;
            // answer가 numbers의 길이보다 크면 numbers의 길이만큼 빼준다.
            if(answer > numbers.length) {
                answer -= numbers.length;
            }
        } 
        return answer;
    }
}