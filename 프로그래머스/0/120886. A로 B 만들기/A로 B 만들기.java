import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // char 배열로 초기화
        char[] beforeChars = before.toCharArray(); 
        char[] afterChars = after.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        // String으로 초기화
        before = new String(beforeChars);
        after = new String(afterChars);
        
        // 두 값이 같으면 1 아니면 0
        return (before.equals(after)) ? 1 : 0;
    }
}