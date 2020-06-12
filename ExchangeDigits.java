import java.util.Arrays;
import java.util.Scanner;

public class ExchangeDigits {
    static int count = 0;
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int[] firstNumberArray = Integer.toString(firstNumber).chars().map(c -> c-'0').toArray();

        //sorting array
        Arrays.sort(firstNumberArray);

        //generating all possible arrangements
        permute(firstNumberArray,0,secondNumber);

    }

    public static void permute(int[] sequence,int k, int secondNumber)
    {
        int j;
        if (k == sequence.length)
        {
            String num = "";
            for (int i = 0; i < sequence.length; i++) {
                num = num + sequence[i];
            }
            if (Integer.parseInt(num) > secondNumber && count == 0)
            {
                System.out.print(num);
                count++;
            }
        }
        else {
            for (int i = k; i < sequence.length; i++) {
                int temp = sequence[k];
                sequence[k] = sequence[i];
                sequence[i] = temp;

                permute(sequence,k+1,secondNumber);

                temp = sequence[k];
                sequence[k] = sequence[i];
                sequence[i] = temp;
            }
        }

    }
}
