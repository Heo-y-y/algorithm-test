class Solution {
    public String solution(String rsp) {
        String answer = "";
        // 가위바위보 값을 공백으로 구분하여 배열로 만든다.
        String [] arr = rsp.split("");
        
        // arr의 길이만큼 돌며, arr의 i번째 인덱스를 비교하며,
        // 이기는 값을 answer에 더한다.
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("2")) {
                answer += "0";
            }
            else if(arr[i].equals("0")) {
                answer += "5";
            }
            else {
                answer += "2";
            }
        }
        return answer;
    }
}