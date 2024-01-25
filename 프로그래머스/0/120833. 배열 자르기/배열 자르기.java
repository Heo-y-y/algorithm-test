import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // answer를 numbers의 길이만큼 지정
        int[] answer = new int[numbers.length];
        // 배열을 원하는 시작점부터 끝까지 복사
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}