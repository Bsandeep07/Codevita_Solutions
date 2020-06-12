import java.util.Scanner;

public class DistributeBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1) return;
        System.out.println(countDer(number));
    }
    static double countDer(int n)
    {
        double der[] = new double[n + 1];

        der[0] = 1;
        der[1] = 0;
        der[2] = 1;

        for (int i = 3; i <= n; ++i)
            der[i] = (i - 1) * (der[i - 1] + der[i - 2]);

        return der[n];
    } }
