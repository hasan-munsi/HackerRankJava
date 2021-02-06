import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThirtyDaysOfCode_Operators {
    static int solve(double meal_cost, int tip_percent, int tax_percent) {
        double result = ((meal_cost*tip_percent/100)+(meal_cost*tax_percent/100)+meal_cost);
        return (int)Math.round(result);

    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double meal_cost = Double.parseDouble(br.readLine().trim());

        int tip_percent = Integer.parseInt(br.readLine().trim());

        int tax_percent = Integer.parseInt(br.readLine().trim());

        System.out.println(solve(meal_cost, tip_percent, tax_percent));

        br.close();
    }
}
