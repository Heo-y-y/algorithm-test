import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int amswer1 = numbers[0] * numbers[1];
        int answer2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return amswer1 > answer2 ? amswer1 : answer2;
    }
}