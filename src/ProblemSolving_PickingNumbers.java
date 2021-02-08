import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class ProblemSolving_PickingNumbers {
    static int getMaxSubsetLength(List<Integer> numbers) {
        int maxSize = 1;
        for(int i=0; i<numbers.size(); i++){
            int elementCount = repeatCount(numbers, numbers.get(i));
            int incElementCount = repeatCount(numbers, numbers.get(i)+1);
            if(elementCount+incElementCount>maxSize){
                maxSize = elementCount+incElementCount;
            }
        }
        return maxSize;
    }
    static int repeatCount(List<Integer> arr, int numner){
        int count = 0;
        for(int num:arr){
            if(num==numner)
                count++;
        }
        return count;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int loop = Integer.parseInt(br.readLine().trim());
        String[] line = br.readLine().trim().split(" ");
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < loop; i++) {
            numbers.add(Integer.parseInt(line[i]));
        }
        Collections.sort(numbers);
        System.out.println(getMaxSubsetLength(numbers));
        br.close();
    }
}
