import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            int uniqueNumber = scanner.nextInt();
            sum += uniqueNumber * uniqueNumber;
        }
        int numberOfVerifiers = sum % 10;
        System.out.println(numberOfVerifiers);
    }
}
