import java.util.Scanner;

public class Base6 {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mainSequence = new int[n];
        int[] derivedSequence = new int[n];
        for (int i = 0; i < n; i++) {
            mainSequence[i] = scanner.nextInt();

            //converting main to base6
            int number = mainSequence[i];
            int sum = 0;
            while (number > 0)
            {
                sum = sum + (number % 6);
                number =number / 6;
            }
            derivedSequence[i] = sum;
        }

        //comparing elements
        int inversions = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (derivedSequence[i] > derivedSequence[j])
                {
                    inversions++;
                }
            }
        }

        System.out.print(inversions);
    }
}
