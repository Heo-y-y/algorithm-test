class Solution {
    public int solution(String my_string, String is_prefix) {
        
        // 주어진 접두사의 길이가 문자열의 길이보다 크다면 접두사가 될 수 없음
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }

        // 주어진 접두사와 문자열의 첫 번째부터 일정 인덱스까지의 부분 문자열을 비교하여 확인
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            }
        }

        // 모든 문자열 비교가 끝났을 때, 접두사라면 1을 반환
        return 1;
    }
}