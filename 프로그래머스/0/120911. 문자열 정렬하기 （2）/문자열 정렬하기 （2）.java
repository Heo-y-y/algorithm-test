import java.util.*;

class Solution {
    public String solution(String my_string) {
        // 소문자로 변경
        my_string = my_string.toLowerCase();
        // char 배열로 변경
        char[] chArr = my_string.toCharArray();
        // chArr 앞파벳순 정렬
        Arrays.sort(chArr);
        
        String answer = new String(chArr);
        return answer;
    }
}