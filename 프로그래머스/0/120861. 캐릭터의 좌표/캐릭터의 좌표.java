class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        // 좌표 초기화
        int[] answer = {0, 0};
        
        // 각 left, right, up, down 확인 후 계산
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
            }
            else if(keyinput[i].equals("right")) {
                answer[0]++;
            }
            else if(keyinput[i].equals("up")) {
                answer[1]++;
            }
            else {
                answer[1]--;
            }
            
            // 맵의 크기가 벗어나면 무시하고, 양수/음수 처리
            if(Math.abs(answer[0]) > board[0] / 2) {
                answer[0] += (answer[0] > 0) ? -1 : 1;
            }
            if(Math.abs(answer[1]) > board[1] / 2) {
                answer[1] += (answer[1] > 0) ? -1 : 1;
            }
        }
        return answer;
    }
}