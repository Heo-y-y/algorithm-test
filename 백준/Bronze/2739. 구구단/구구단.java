import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        for (int i = 1; i < 10; i++) {

            System.out.println(val + " * " + i + " = " + (val * i));
        }
    }
}