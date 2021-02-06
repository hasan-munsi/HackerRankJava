import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyDaysOfCode_LetsReview {
    static void evenOddAlphabets(String s) {
        for (int i=0; i<s.length(); i++){
            if(i%2==0)
                System.out.print(s.toCharArray()[i]);
        }
        System.out.print(" ");
        for (int i=0; i<s.length(); i++){
            if(i%2==1)
                System.out.print(s.toCharArray()[i]);
        }
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine().trim());
        for(int i=0; i<number; i++){
            String s = br.readLine().trim();
            evenOddAlphabets(s);
            System.out.println();
        }
        br.close();
    }
}
