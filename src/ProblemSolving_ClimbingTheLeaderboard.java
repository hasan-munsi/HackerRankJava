import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProblemSolving_ClimbingTheLeaderboard {

    static int getIndexBinarySearch(List<Integer> arr, int point) {
        int start = 0, end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == point)
                return mid;
            else if (arr.get(start) == point)
                return start;
            else if (arr.get(end) == point)
                return end;
            else if (point > arr.get(mid) && point < arr.get(mid - 1))
                return mid;
            else if (point < arr.get(mid) && point >= arr.get(mid + 1))
                return mid + 1;
            else if (arr.get(mid) < point) {
                end = mid - 1;
            } else if (arr.get(mid) > point) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int rankedCount = Integer.parseInt(br.readLine().trim());
        Object[] distinctScore = Arrays.stream(br.readLine().trim().split(" ")).distinct().toArray();
        List<Integer> listedScores = new ArrayList<Integer>();
        for (Object i : distinctScore
        ) {
            listedScores.add(Integer.parseInt(i.toString()));
        }
        int scoreCount = Integer.parseInt(br.readLine().trim());
        String[] scoreString = br.readLine().trim().split(" ");
        for (int i = 0; i < scoreCount; i++) {
            int point = Integer.parseInt(scoreString[i]);
            if (point >= listedScores.get(0)) {
                System.out.println(1);
                continue;
            } else if (point == listedScores.get(listedScores.size() - 1)) {
                System.out.println(listedScores.size());
                continue;
            } else if (point < listedScores.get(listedScores.size() - 1)) {
                System.out.println(listedScores.size() + 1);
                continue;
            } else
            System.out.println(getIndexBinarySearch(listedScores,point)+1);
        }

        br.close();
    }
}
