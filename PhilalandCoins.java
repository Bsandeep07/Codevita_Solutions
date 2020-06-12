import java.util.Scanner;

public class PhilalandCoins {
    public static void main(String[] args) {
        //taking input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            while (input[i] > 0)
            {
                input[i] = input[i] / 2;
                count++;
            }
            System.out.println(count);
        }
    }
}
