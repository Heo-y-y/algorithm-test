class Solution {
    public String solution(String polynomial) {
        String answer = "";
        // 계수와 상수 선언
        int x = 0;
        int num = 0;
        
        // 공백으로 나눠 s라는 문자열을 판단하는 반복문
        for(String s : polynomial.split(" ")) {
            // 문자열이 x를 포함하면,
            // x만 있으면, 앞에 1 반환 아니면 해당 값을 정수로 변환하여 반환 후 x에 값 더함
            if(s.contains("x")) {
                x += s.equals("x") ? 1 : Integer.parseInt(s.substring(0, s.length() - 1));
            }
            // 문자열이 +가 아니면 상수로 저장
            else if(!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        
        // 계수가 존재하면 삼항연산자를 연산, 1이면 x만 아니면 x계수와 x라는 문자열을 더해서 반환
        String x_str = x > 0 ? (x == 1 ? "x" : x + "x") : "";
        // 상수가 존재하면 문자열로 변환 후 반환, 존재하지 않으면 ""
        String num_str = num > 0 ? Integer.toString(num) : "";
        
        if(x > 0) {
            // 계수와 상수가 모두 존재할 경우
            if(num > 0) {
                answer += x_str + " + " + num_str;
            }
            // 계수만 존재할 경우
            else {
                answer += x_str;
            }
        }
        
        // 계수가 존재하지 않고, 상수만 존재할 경우
        else if(num > 0) {
            answer += num_str;
        }
        return answer;
    }
}