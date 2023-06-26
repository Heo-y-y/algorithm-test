import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;

        for (byte vale : br.readLine().getBytes()) {
            sum += (vale - 48);
        }
        System.out.println(sum);
    }
}