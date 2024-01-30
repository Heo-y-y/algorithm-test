class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // replace를 사용하여 바꾸고 싶은 문자 치환
        answer = my_string.replace(letter, "");
        return answer;
    }
}