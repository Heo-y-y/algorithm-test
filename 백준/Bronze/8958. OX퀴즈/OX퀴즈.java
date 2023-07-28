import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int count = 0;
            int sum = 0;

            for (byte value : br.readLine().getBytes()) {

                if (value == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}


