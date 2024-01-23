class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        // 분자와 분모에 연산 진행
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
		// 약분을 위해 최소공배수 값을 연산된 분자값의 -1씩 내려가며 연산
        for(int i = numer - 1; i > 1; i--) {
			// 최소공배수가 맞으면 결과의 분자와 분모를 약분
            if(numer % i == 0 && denom % i == 0) {
                numer /= i;
                denom /= i;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}