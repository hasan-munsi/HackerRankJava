import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyDaysOfCode_Arrays {

    static void arrReverse(int[] arr){
        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[number];
        String arrString = br.readLine().trim();
        String[] arrElements = arrString.split(" ");
        for(int i =0; i<number; i++){
            arr[i] = Integer.parseInt(arrElements[i]);
        }
        arrReverse(arr);
        br.close();
    }
}
