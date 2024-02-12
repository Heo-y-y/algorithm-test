import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // 오름차순 정렬
        Arrays.sort(numlist);
        
        // 중첩된 반복문을 통해 각 요소와 n 사이의 거리를 비교
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < numlist.length; j++) {
                // numlist[i]가 numlist[j]보다 n과의 거리가 더 가까우면 위치 변경
                if(Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}