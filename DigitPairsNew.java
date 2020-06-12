import java.util.Scanner;

public class DigitPairsNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0 && n <= 500) {
            int[] inputs = new int[n];
            int[] bitScores = new int[n];
            int numberOfPairs = 0;
            for (int i = 0; i < n; i++) {
                inputs[i] = scanner.nextInt();
                if (inputs[i] < 100 || inputs[i] > 999)
                {
                    System.out.print("Invalid Input");
                    return;
                }
                //calculating bit scores
                int smallest = 9;
                int largest = 0;
                while (inputs[i] > 0) {
                    int digit = inputs[i] % 10;
                    inputs[i] = inputs[i] / 10;

                    if (digit > largest) {
                        largest = digit;
                    }
                    if (digit < smallest) {
                        smallest = digit;
                    }
                }
                bitScores[i] = ((largest * 11) + (smallest * 7)) % 100;
            }

            //234 567 321 345 123 110 767 111

            //finding pairs
            for (int i = 0; i < n - 2; i++) {
                int msb_count = 0;
                for (int j = i + 2; j < n; j += 2) {
                    if (bitScores[i] == 0)
                    {
                        break;
                    }
                    else if (bitScores[i] / 10 == bitScores[j] / 10) {
                        msb_count++;
                        bitScores[j] = 0;
                        if (msb_count <= 2)
                        {
                            numberOfPairs++;
                        }
                    }
                }
            }
            System.out.print(numberOfPairs);
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}
