class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 숫자가 아닌 것들을 제외하고 s배열로 초기화
        String[] s = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        // s를 돌며 비어있지 않으면 s[i]를 정수로 변환하여 +
        for(int i = 0; i < s.length; i++) {
            answer += (!s[i].isEmpty()) ? Integer.parseInt(s[i]) : 0;
        }
        
        return answer;
    }
}