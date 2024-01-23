class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 담을 그릇 2개로 초기화
        int[] answer = new int[2];
        // 짝수를 담을 그릇과 홀수를 담을 그릇 
        int even = 0;
        int odd = 0;
        // num_list의 길이만큼 돌면서 짝수면 even++, 홀수면 odd++
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } 
            else {
                odd++;
            }
            // 원하는 인덱스 위치에 초기화
            answer[0] = even;
            answer[1] = odd;
        }
        return answer;
    }
}