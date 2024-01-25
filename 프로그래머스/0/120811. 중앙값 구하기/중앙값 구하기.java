import java.util.Arrays;

class Solution {
    public int solution(int[] array) {        
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(array);
        // 배열의 중앙값 구하기
        answer = array[array.length / 2];
        return answer;
    }
}