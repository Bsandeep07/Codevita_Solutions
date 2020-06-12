import java.util.Scanner;

public class DistributeBooksNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(countDerr(n));
    }

    public static long countDerr(int n)
    {
        long[] der = new long[n+1];
        der[0] = 1;
        der[1] = 0;
        der[2] = 1;

        for (int i = 3; i <= n; i++) {
            der[i] = (i-1) * (der[i-1]+der[i-2]);
        }

        return der[n];
    }
}
