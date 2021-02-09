import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyDaysOfCode_FactorialWithRecursion {
    static int factorial(int number) {
        if(number<=1)
            return 1;
        return number*factorial(number-1);
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine().trim());
        System.out.println(factorial(number));
        br.close();
    }
}
