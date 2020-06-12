import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        //taking inputs
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += result^numbers[i];
        }
        if (result == 0)
        {
            System.out.print("JASBIR");
        }
        else {
            System.out.print("AMAN");
        }
    }

    public static int XOR(int x,int y)
    {
        return (x | y) & (~x | ~y);
    }
}
