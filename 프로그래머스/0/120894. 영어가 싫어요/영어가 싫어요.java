class Solution {
    public long solution(String numbers) {
        // s에 영단어로 된 숫자들 대입
        String[] s = {
             "zero", "one", "two", "three"
             , "four", "five", "six", "seven"
             , "eight", "nine"
        };
        
        // s를 돌며, replaceAll로 s의 i번째를 숫자 String으로 대입
        for(int i = 0; i < s.length; i++) {
            numbers = numbers.replaceAll(s[i], String.valueOf(i));
        }
        // Long.parseLong을 이용해 numbers의 String 숫자를 long으로 변환
        return Long.parseLong(numbers);
    }
}