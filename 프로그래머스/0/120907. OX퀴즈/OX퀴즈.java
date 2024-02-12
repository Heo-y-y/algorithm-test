class Solution {
    public String[] solution(String[] quiz) {
        // quiz 길이로 선언
       String[] answer = new String[quiz.length];
        
        // quiz를 돌며 각 i번째를 " " 기준으로 배열에 넣는다.
        for(int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            
            // + 인 경우
            if(s[1].equals("+")) {
                if(Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";                
                } else {
                    answer[i] = "X";
                }
            }
        
            // - 인 경우
            if(s[1].equals("-")) {
                if(Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
