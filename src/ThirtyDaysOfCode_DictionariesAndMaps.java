import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ThirtyDaysOfCode_DictionariesAndMaps {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int loop = Integer.parseInt(br.readLine().trim());
        Map phoneBook = new HashMap();
        for(int i=0; i<loop;i++){
            String[] data = br.readLine().trim().split(" ");
            phoneBook.put(data[0],data[1]);
        }
        boolean l = true;
        while (l){
            try{
                String s = br.readLine().trim();
                if(s==null){
                    l = false;
                    break;
                }
                if(phoneBook.containsKey(s)){
                    System.out.println(s+"="+phoneBook.get(s));
                }else {
                    System.out.println("Not found");
                }
            }catch (Exception e){
                break;
            }
        }

        br.close();
    }
}
