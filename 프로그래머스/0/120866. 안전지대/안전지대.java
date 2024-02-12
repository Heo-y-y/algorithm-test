class Solution {
    public int solution(int[][] board) {
        // 각 위치에서 폭발이 발생하는 것을 표시하는 2차원 배열
        int[][] boom = new int[board.length][board[0].length];
        
        // board를 순회하며 값이 1인 위치에 check 메서드로 폭탄 주변에 1을 넣어줌
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) check(i, j, boom);
            }
        }
        
        // 0인 곳을 탐색하여 answer++
        int answer = 0;
        for(int[] arr : boom) {
            for(int value : arr) {
                if(value == 0) answer++;
            }
        }
        return answer;
    }
    
    // 폭탄이 있는 상,하,좌,우,대각선에 1대입
    static void check(int x, int y, int[][] boom) {
        int explosionX;
        int explosionY;
        int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < 9; i++) {
            explosionX = x + aroundX[i];
            explosionY = y + aroundY[i];
            if (explosionX < boom.length && explosionY < boom.length)
                if (explosionX >= 0 && explosionY >= 0) boom[explosionX][explosionY] = 1;
        }
    }
}