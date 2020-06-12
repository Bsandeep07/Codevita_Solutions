import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chakravyuha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] chakravyuha = new int[n][n];

        //creating chakravyuha
        int numOfSpiral = (n+1) / 2;
        int start = 0;
        int end = n -1;
        int count = 0;
        int totalPowerPoints = 1;
        List<Integer> powerPointCoordinates = new ArrayList<>();
        powerPointCoordinates.add(0);
        powerPointCoordinates.add(0);
        for (int spiral = 1; spiral <= numOfSpiral; spiral++) {
            //for top bar
            for (int top = start; top <= end; top++) {
                count++;
                chakravyuha[start][top] = count;
                if (chakravyuha[start][top] % 11 == 0)
                {
                    totalPowerPoints++;
                    powerPointCoordinates.add(start);
                    powerPointCoordinates.add(top);
                }
            }
            if (start == end)
            {
                break;
            }
            //for right bar
            for (int right = start + 1; right <= end ; right++) {
                count++;
                chakravyuha[right][end] = count;
                if (chakravyuha[right][end] % 11 == 0)
                {
                    totalPowerPoints++;
                    powerPointCoordinates.add(right);
                    powerPointCoordinates.add(end);
                }
            }
            //for bottom bar
            for (int bottom = end - 1; bottom >= start ; bottom--) {
                count++;
                chakravyuha[end][bottom] = count;
                if (chakravyuha[end][bottom] % 11 == 0)
                {
                    totalPowerPoints++;
                    powerPointCoordinates.add(end);
                    powerPointCoordinates.add(bottom);
                }
            }
            //for left bar
            for (int left = end - 1; left > start ; left--) {
                count++;
                chakravyuha[left][start] = count;
                if (chakravyuha[left][start] % 11 == 0)
                {
                    totalPowerPoints++;
                    powerPointCoordinates.add(left);
                    powerPointCoordinates.add(start);
                }
            }

            start++;
            end--;
        }

        //printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chakravyuha[i][j] + "\t");
            }
            System.out.println();
        }

        //printing total number of power points
        System.out.println("Total Power points : " + totalPowerPoints);

        //printing power point coordinates
        for (int i = 0; i < powerPointCoordinates.size(); i+=2) {
            System.out.print("(" + powerPointCoordinates.get(i) + "," + powerPointCoordinates.get(i+1) + ")" + "\n");
        }
    }
}
