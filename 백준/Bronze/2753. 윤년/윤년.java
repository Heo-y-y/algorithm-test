import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int leapYear = 1;

        if (year % 4 == 0) {
            if (year % 400 == 0) System.out.println(leapYear);
            else if (year % 100 == 0) System.out.println("0");
            else System.out.println(leapYear);
        }
        else System.out.println("0");
    }
}

