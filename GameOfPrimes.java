import java.util.Scanner;

public class GameOfPrimes {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int indexOfRequiredElement = scanner.nextInt();
        if (start > end || start < 1 || indexOfRequiredElement < 1)
        {
            System.out.print("Invalid Input");
        }

        //generating all the primes numbers
        int numberOfHappyNumber = 0;
        for (int i = start+1; i <= end ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
            {
                //separating digits
                int num = i;
                int digitSquare = 0;
                while (true) {
                    while (num > 0) {
                        int digits = num % 10;
                        digitSquare = digitSquare + (digits * digits);
                        num = num / 10;
                    }
                    if (digitSquare == 1)
                    {
                            numberOfHappyNumber++;
                            if (numberOfHappyNumber == indexOfRequiredElement)
                            {
                                System.out.print(i);
                                return;
                            }
                            break;
                    }
                    else if (digitSquare == 4)
                    {
                        break;
                    }
                    else {
                        num = digitSquare;
                        digitSquare = 0;
                    }
                }
            }
        }
        if (numberOfHappyNumber != indexOfRequiredElement)
        {
            System.out.print("No number is present at this Index");
        }
    }
}
