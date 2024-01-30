class Solution {
    public String solution(String my_string) {
        // reverse 활용을 위해 StringBuffer 생성
        StringBuffer sb = new StringBuffer(my_string);
        // reverse를 사용해 문자열을 뒤집는다.
        return sb.reverse().toString();
    }
}