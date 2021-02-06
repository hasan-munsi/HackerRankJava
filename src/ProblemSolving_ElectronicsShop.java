import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProblemSolving_ElectronicsShop {

    static int getMaxBudget(int b, int[] kbPrices, int[] usbPrices){
        int maxBudget = -1;
        for (int kb:
             kbPrices) {
            for (int usb:
                 usbPrices) {
                if(kb+usb<=b && kb+usb>maxBudget)
                    maxBudget = kb+usb;
            }
        }
        return maxBudget;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] firstLine = br.readLine().trim().split(" ");
        int budget = Integer.parseInt(firstLine[0]);
        int kbLength = Integer.parseInt(firstLine[1]);
        int usbLength = Integer.parseInt(firstLine[2]);
        String[] kbPricesString = br.readLine().trim().split(" ");
        String[] usbPricesString = br.readLine().trim().split(" ");
        int[] kbPrices = new int[kbLength];
        int[] usbPrices = new int[usbLength];

        for(int i = 0; i<kbLength; i++){
            kbPrices[i] = Integer.parseInt(kbPricesString[i]);
        }

        for(int i = 0; i<usbLength; i++){
            usbPrices[i] = Integer.parseInt(usbPricesString[i]);
        }
        System.out.println(getMaxBudget(budget, kbPrices, usbPrices));
        br.close();
    }
}
