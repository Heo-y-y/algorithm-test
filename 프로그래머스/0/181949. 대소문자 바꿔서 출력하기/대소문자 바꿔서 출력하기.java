import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        // a의 문자를 돌며
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            
            // 대문자인 경우
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }
            // 소문인 경우
            else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}