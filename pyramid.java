import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() + 1;
        int input[] = new int[n];
        int flag = 0;

        for (int k = 0; k < n - 1 ; k++) {
            input[k] = scan.nextInt();
        }

        for (int inputs = 0; inputs < n ; inputs++) {
            int series[] = new int[input[inputs]];
            series = generateSeries(input[inputs] * (input[inputs] + 1) / 2);
            int a = input[inputs] - 1;
            for (int i = 0; i < input[inputs]; i++) {
                int space = 3 * a;
                if (i < input[inputs] - 1) {
                    System.out.print(String.format("%" + space + "s", ""));
                }
                a--;
                for (int j = 0; j <= i; j++) {
                    System.out.print(String.format("%05d", series[flag]) + " ");
                    flag++;
                }
                System.out.println(" ");
            }
            flag = 0;
        }
    }
        public static int[] generateSeries (int n) {
            int series[] = new int[n];
        if (n > 0) {
                int first = 6, second = 28;
                series[0] = first;
                if (n > 1) {
                    series[1] = second;
                }
                for (int x = 2; n > 2 && x < n; x++) {
                    series[x] = second + (second - first) + 16;
                    first = second;
                    second = series[x];
                }
            }
            return series;
        }
    }