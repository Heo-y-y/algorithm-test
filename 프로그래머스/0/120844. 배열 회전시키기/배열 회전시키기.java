class Solution {
    public int[] solution(int[] numbers, String direction) {
        // answer를 numbers의 길이로 초기화
        int[] answer = new int[numbers.length];
        
        // direction이 right이면,
        if(direction.equals("right")) {
            // 1번째부터 numbers를 돌며, 
            // answer의 i번째에 numbers의 원래 값 대입
            // answer의 0번째에는 numbers의 마지막 값 대입
            for(int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length - 1];
        }
        // direction이 left이면,
        else {
            // 0번째부터 numbers의 마지막까지 돌며,
            // answer의 i번째에 numbers의 i+1번째 값부터 대입
            // answer의 마지막 값에 numbers의 0번째 값 대입
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }
        return answer;
    }
}