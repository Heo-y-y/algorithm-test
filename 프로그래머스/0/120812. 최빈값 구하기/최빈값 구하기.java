import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 최빈값 개수 그릇
        int maxCount = 0;
        // 최빈값 그릇
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
 
        for(int number : array) {
            // 키 값을 count에 할당
            int count = map.getOrDefault(number, 0) + 1;

            // count가 maxCount보다 크면,
            if(count > maxCount) {
                // maxCount를 count로 초기화
                maxCount = count;
                // answer를 number로 초기화
                answer = number;
            }
            // 최빈값이 여러 개면 -1
            else if(count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}