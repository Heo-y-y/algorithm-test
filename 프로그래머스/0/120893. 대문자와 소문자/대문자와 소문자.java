class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 변수를 돌며 대문자면 소문자로, 소문자면 대문자로 answer에 +
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            }
            else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}