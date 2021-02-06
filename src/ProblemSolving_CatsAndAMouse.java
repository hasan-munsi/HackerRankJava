import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemSolving_CatsAndAMouse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int loop = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i<loop; i++){
            String[] line = br.readLine().trim().split(" ");
            int catA = Integer.parseInt(line[0]);
            int catB = Integer.parseInt(line[1]);
            int mouseC = Integer.parseInt(line[2]);
            int distanceFromA = Math.abs(catA-mouseC);
            int distanceFromB = Math.abs(catB-mouseC);
            if(distanceFromA==distanceFromB)
                System.out.println("Mouse C");
            else if(distanceFromA<distanceFromB)
                System.out.println("Cat A");
            else System.out.println("Cat B");

        }
        br.close();
    }
}
