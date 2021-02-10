import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirtyDaysOfCode_2DArrays {
    static int hourGlassSubSets(int[][] arr){
        List<Integer> sum = new ArrayList<Integer>();
        for(int k = 0; k<4; k++){
            for(int l = 0; l<4; l++){
            int thisMax = 0;
                List<Integer> subsets = new ArrayList<Integer>();
                for(int i=l;i<=l+2;i++){
                    subsets.add(arr[k][i]);
                }
                subsets.add(arr[k+1][l+1]);
                for(int i=l;i<=l+2;i++){
                    subsets.add(arr[k+2][i]);
                }
                for (int i:
                     subsets) {
                   thisMax = thisMax+i;
                }
                sum.add(thisMax);
            }
        }
        return Collections.max(sum);
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] lines = new String[6];
       for(int i = 0; i<6; i++){
           lines[i] = br.readLine().trim();
       }
       int[][] arr = new int[6][6];
        for (int i = 0; i<6; i++) {
            String[] sNumbers = lines[i].trim().split(" ");
            for (int j = 0; j<6; j++){
                arr[i][j] = Integer.parseInt(sNumbers[j]);
            }
        }
        System.out.println(hourGlassSubSets(arr));;
        br.close();
    }
}
