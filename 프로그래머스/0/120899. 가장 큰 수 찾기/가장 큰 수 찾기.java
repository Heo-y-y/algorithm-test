class Solution {
    public int[] solution(int[] array) {
        // 최대값을 계산하기 위해 array 첫번째 값을 지정
        int max = array[0];
        int index = 0;
        
        // array를 돌며 max보다 크면 max에 i값 할당, index에 i값 할당
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
}