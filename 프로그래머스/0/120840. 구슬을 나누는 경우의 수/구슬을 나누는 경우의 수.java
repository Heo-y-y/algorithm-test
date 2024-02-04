class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int balls, int share) {
        // Base Case 고르는 개수가 0이거나, 모든 구슬을 다 고를 때: 경우의 수는 1
        if(share == 0 || balls == share ) return 1;
        // 현재 구슬을 선택하거나, 선택하지 않는 두 가지 경우를 더한다.
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}