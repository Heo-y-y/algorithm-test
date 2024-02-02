class Solution {
    public int solution(int hp) {
        // 필요한 장군개미의 수를 먼저 구한다.
        int answer = hp / 5;
        // 장군개미를 전부 상대하고 남은 hp
        hp %= 5;
        
        // 남은 hp에 필요한 병정개미의 수를 구한다.
        answer += hp / 3;
        // 병정개미를 전부 상대하고 남은 hp
        hp %= 3;
        
        // 남은 hp에 필요한 일개미의 수를 구한다.
        answer += hp / 1;
        
        return answer;
    }
}