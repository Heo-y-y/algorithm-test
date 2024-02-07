class Solution {
    public String solution(String my_string, int num1, int num2) {
        // char 배열로 변경
        char[] arr = my_string.toCharArray();
        
        // 각 해당하는 위치 체인지
        arr[num1] = my_string.charAt(num2);
        arr[num2] = my_string.charAt(num1);
        
        // String으로 변경
        String answer = String.valueOf(arr);
    
        return answer;
    }
}