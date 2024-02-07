import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // stream.filter로 n의 배수를 찾고, toArray로 배열로 만든다.
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
}