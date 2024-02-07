class Solution {
    public int solution(String s) {
        // 문자열을 공백 기준으로 배열에 대입
        String[] arr = s.split(" ");               
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            // Z이면 Z이전 인덱스 값을 빼줌
            if(arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            }
            // Z가 아니면 해당 인덱스 값을 더해줌
            else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
}