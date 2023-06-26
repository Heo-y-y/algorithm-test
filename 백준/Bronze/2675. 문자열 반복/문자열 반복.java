import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            for (byte val : str[1].getBytes()) {
                sb.append(String.valueOf((char) val).repeat(Math.max(0, r)));
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
