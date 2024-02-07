class Solution {
    public int[] solution(String[] strlist) {
        // strlist의 길이만큼 초기화
        int[] answer = new int [strlist.length];
        
        // strlist을 돌며 answer의 인덱스에 strlist의 인덱스의 값의 크기 할당
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}