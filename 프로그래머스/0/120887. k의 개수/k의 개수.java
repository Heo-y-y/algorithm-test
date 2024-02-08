class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        // i~j까지 각 문자를 strNum에 캐스팅
        for(int a = i; a <= j; a++) {
            String strNum = Integer.toString(a);
            
            // b~strNUm을 돌며 k가 b가 같으면 answer++
            for(int b = 0; b < strNum.length(); b++) {
                if(Integer.toString(k).equals(strNum.substring(b, b + 1))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}