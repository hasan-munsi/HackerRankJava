import java.util.Scanner;

public class ThirtyDaysOfCode_IntroToConditionalStatements {
    public static String weirdCheck(int num){
        String w = "Weird", nw = "Not Weird";
        if(num>20){
            return num%2==0?nw:w;
        }else if(num<21 && num>5){
            return w;
        }else if(num==2 || num == 4){
            return nw;
        }
        else if(num%2==1)
            return w;
        else return nw;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(weirdCheck(i));
        scan.close();
    }
}
