class Solution {
    public String solution(String letter) {
        String answer = "";
        // 모스부호 대입
        String [] morseList = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        
        String[] morse;
        // 공백을 기준으로 입력값의 모스부호를 대입
        morse = letter.split(" ");
        
        // morse값과 morseList값이 일치하는 index를 찾아 'a'를 더함
        for(String s : morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
}