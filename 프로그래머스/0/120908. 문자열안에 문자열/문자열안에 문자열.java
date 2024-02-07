class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // str2가 있으면 1
        if(str1.contains(str2)) {
            answer = 1;
        }
        // 없으면 2
        else {
            answer = 2;
        }
        return answer;
    }
}