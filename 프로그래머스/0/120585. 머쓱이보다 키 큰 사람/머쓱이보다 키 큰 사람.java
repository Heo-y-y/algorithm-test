class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // array를 돌며 height보다 크면 answer++
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }
        return answer;
    }
}