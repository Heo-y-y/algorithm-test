/*직사각형의 가로, 세로 길이 구하는 법
가로 길이: x1~x4 중 최댓값에서 최솟값 뺀 값
세로 길이: y1~y4 중 최댓값에서 최솟값 뺀 값
*/
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];
        
        // x좌표와 y좌표의 촤솟값, 최대값을 구하기위해 min(), max() 사용
        for(int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        } 
        // 사각형 넓이 = 가로 x 세로
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}