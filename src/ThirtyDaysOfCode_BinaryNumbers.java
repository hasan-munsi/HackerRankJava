import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ThirtyDaysOfCode_BinaryNumbers {

    static List<Integer> binary(int num){
        List<Integer> binaryList = new ArrayList<Integer>();
        while(num>0){
            binaryList.add(0,num%2);
            num = num/2;
        }

        return binaryList;
    }

    static int maxConsecutiveOne(List<Integer> list){
        int repeatCount = 0, maxRepeatCount = 0;
        for (int i:
                list) {
            if(i==1)
            {
                repeatCount++;
            }else if(i==0 && maxRepeatCount<repeatCount){
                maxRepeatCount = repeatCount;
                repeatCount = 0;
            }else if(i==0){
                repeatCount = 0;
            }
        }
        return Math.max(maxRepeatCount,repeatCount);
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine().trim());
        System.out.println(maxConsecutiveOne(binary(number)));
        br.close();
    }
}
