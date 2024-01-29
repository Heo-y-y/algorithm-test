class Solution {
    public int[] solution(int[] num_list) {
        // num_list와 길이가 같은 빈 배열 생성
        int[] answer = new int[num_list.length];        
        // num_list의 길이만큼 반복하며 거꾸로 answer에 대입
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
}