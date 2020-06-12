import java.util.Arrays;
import java.util.Scanner;

public class CollectingCandies {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        if (numberOfTestCases > 0 && numberOfTestCases <= 10) {
            for (int testcase = 0; testcase < numberOfTestCases; testcase++) {
                //taking values
                long numberOfBoxes = scanner.nextLong();
                long[] candies = new long[(int) numberOfBoxes];
                for (int box = 0; box < numberOfBoxes; box++) {
                    candies[box] = scanner.nextLong();
                }
                if (numberOfBoxes > 0 && numberOfBoxes <= 10000) {
                    //calculating minimum time required
                    long[] timeTaken = new long[(int) numberOfBoxes];
                    if (numberOfBoxes > 1) {
                        timeTaken[0] = candies[0] + candies[1];
                    }
                    if (numberOfBoxes == 1) {
                        System.out.print(1);
                        return;
                    }
                    for (int c = 2; c < candies.length; c++) {
                        timeTaken[c - 1] = candies[c] + timeTaken[c - 2];
                    }
                    //adding all the time
                    long totalTime = 0;
                    for (int i = 0; i < timeTaken.length; i++) {
                        totalTime += timeTaken[i];
                    }
                    System.out.print(totalTime);
                }
            }
        }
    }
}
