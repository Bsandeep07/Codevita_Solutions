import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = n;
        int series[] = new int[n*(n+1)];
        int start = 0;
        int end = n*(n+1);
        //filling array
        for (int i = 0; i < series.length; i++) {
            series[i] = 10 * (i+1);
        }

        //printing output
        for (int row = 0; row < n; row++) {
            String repeated = new String(new char[row*2]).replace("\0","*");
            System.out.print(repeated);
            for (int i = 0; i < count; i++) {
                System.out.print(series[start]);
                start++;
            }
            for (int i = count; i > 0; i--) {
                if (i == 1)
                {
                    System.out.print(series[end - i] / 10);
                    continue;
                }
                System.out.print(series[end - i]);
            }
            System.out.println();
            end = end - count;
            count--;
        }
    }
}
