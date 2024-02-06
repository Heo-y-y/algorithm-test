class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // my_string을 돌며 answer에 i번째 문자가 중복이 없는 경우,
        // answer에 해당 문자를 더해준다.
        for(int i = 0; i < my_string.length(); i++) {
            if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}