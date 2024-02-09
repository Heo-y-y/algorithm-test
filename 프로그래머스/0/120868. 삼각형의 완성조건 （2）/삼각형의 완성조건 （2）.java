import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(sides);
        
        int max = sides[1];
        int min = sides[0];
        
        int lowRrange = max - min;
        int highRange = max + min;
        
        answer = highRange - lowRrange -1;
        return answer;
    }
}