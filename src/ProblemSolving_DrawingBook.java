import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ProblemSolving_DrawingBook {
    public static int findNearestPath(int length,int page){
        int totalPageTurnCountFromFront = length / 2;
        int targetPageTurnCountFromFront = page / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }
    public static void main(String[] args) {
        int bookLength, pageToGo;
        Scanner sc = new Scanner(System.in);
        bookLength = sc.nextInt();
        pageToGo = sc.nextInt();
        System.out.println(findNearestPath(bookLength,pageToGo));
    }
}
