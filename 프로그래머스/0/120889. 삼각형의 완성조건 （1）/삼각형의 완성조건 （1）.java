import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 오름차순 정렬
        Arrays.sort(sides);
        
        int answer = 0;
        
        // 삼각형을 만들 수 있을 때
        if(sides[0] + sides[1] > sides[2]) {
            answer = 1;
        }
        // 삼각형을 만들 수 없을 때
        else {
            answer = 2;
        }
        return answer;
    }
}