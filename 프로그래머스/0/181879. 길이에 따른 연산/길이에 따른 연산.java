class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        // 11이상인 경우
        if(num_list.length >= 11) {
            answer = 0;
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        }
        // 10이하인 경우
        else {
            for(int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }
}