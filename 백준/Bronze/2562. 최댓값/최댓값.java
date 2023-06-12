import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {

            int val = Integer.parseInt(bufferedReader.readLine());

            if (val > max) {
                max = val;
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
