class Solution {
    public String solution(int age) {
        // 결과를 저장할 빈 문자열
        String answer = "";
        // PROGRAMMERS-962 행성의 나이의 각 자릿수
        String prg962 = "abcdefghij";
        // 입력값 age를 문자열로 변환하고, 각 자릿수를 배열에 초기화
        String[] ageArr = String.valueOf(age).split("");
        
        // ageArr의 각 자릿수를 순회하며, 
        //해당 자릿수에 해당하는 문자를 prg962 문자열에서 가져와 answer에 할당
        for(int i = 0; i < ageArr.length; i++) {
            answer += prg962.charAt(Integer.valueOf(ageArr[i]));
        }
        return answer;
    }
}