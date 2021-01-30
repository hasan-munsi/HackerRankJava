import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

class BillDivision {
    static String action(List<Integer> bills, int skippedDish, int givenBill){
        bills.remove(skippedDish);
        int totalBill = 0;
        for(int i : bills){
            totalBill = totalBill+i;
        }
        int actualBill = totalBill/2;
        return actualBill==givenBill?"Bon Appetit":""+(givenBill-actualBill)+"";
    }
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().trim().split(" ");
        int skippedDish = Integer.parseInt(firstLine[1]);
        List<Integer> bills = Arrays.stream(br.readLine().trim().split(" ")).map(Integer::parseInt).collect(toList());
        int givenBill = Integer.parseInt(br.readLine().trim());
        System.out.print(action(bills, skippedDish, givenBill));
    }
}

