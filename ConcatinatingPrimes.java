import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConcatinatingPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int outputCount = 0;
        List<Integer> primeNumbers = checkPrime(n);
        int[] numbers = primeNumbers.stream().mapToInt(Integer::intValue).toArray();
        String[] numbersString = Arrays.toString(numbers).split("[\\[\\]]")[1].split(", ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                String temp = numbersString[i]+numbersString[j];
                if (confirmPrime(Integer.parseInt(temp)) == 1)
                {
                    outputCount++;
                }
            }
        }
        System.out.print(outputCount);
    }

    public static List<Integer> checkPrime(int n)
    {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int flag = 0;
            for (int c = 2; c <= i/2 ; c++) {
                if (i % c == 0){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static int confirmPrime(int n)
    {
        int flag = 0;
            for (int c = 2; c <= n/2 ; c++) {
                if (n % c == 0){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return 1;
            }
            else {
                return 0;
            }
    }
}
