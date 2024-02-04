class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        // 1사분면 상황
        if(dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        }
        // 2사분면 상황
        else if(dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        }
        // 3사분명 상황
        else if(dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        // 다 통과하면 4사분면
        } else {
            answer = 4;
        }
        return answer;
    }
}