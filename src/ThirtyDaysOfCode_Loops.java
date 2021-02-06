import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyDaysOfCode_Loops {
    static void table(int number) {
        for(int i = 1; i<=10; i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }

    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine().trim());
        table(number);
        br.close();
    }
}
