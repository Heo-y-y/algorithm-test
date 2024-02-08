class Solution {
    public String solution(String bin1, String bin2) {
        // toBinaryString으로 2진수를 String으로 만들어줌
        // parseInt(값, 진수)로 계산
        return Integer.toBinaryString(
            Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}