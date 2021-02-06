import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ProblemSolving_SalesByMatch {
    public static int getItemCount(int item, List<Integer> itemList){
        int i = 0;
        for(int j: itemList){
            if(item == j)
                i++;
        }
        return i;
    }
    public static int getPairs(List<Integer> itemList){
        int result = 0;
        List<Integer> counts = new ArrayList<>();
        for(int i = 0; i<itemList.size(); i++){
            counts.add(getItemCount(itemList.get(i),itemList));
            itemList.removeAll(Collections.singleton(itemList.get(i)));
            i = 0;
        }
        for(int count:counts){
            result = result+((int)(count/2));
        }
        return result;
    }
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine().trim());
        String[] itemsString = br.readLine().trim().split(" ");
        List<Integer> items = new ArrayList<>();
        for(String data : itemsString){
            items.add(Integer.parseInt(data));
        }
        System.out.println(getPairs(items));
    }
}
