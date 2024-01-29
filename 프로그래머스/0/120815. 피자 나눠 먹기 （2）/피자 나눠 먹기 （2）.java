class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // i를 판수 1로 시작해서 인원수만큼
		for (int i = 1; i <= n; i++) {
            // 6 * i가 인원수로 나눈값이 나머지가 0이면
			if (6 * i % n == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
