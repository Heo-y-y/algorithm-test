import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        // 1~n까지  i이가 n의 약수인 경우 배열로 반환
        return IntStream.rangeClosed(1, n).filter(i -> (n % i == 0)).toArray();
    }
}