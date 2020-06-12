import java.util.Scanner;

public class MountainSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = 2;
        if (n > 2)
        {
            if (n == 3)
            {
                System.out.print(s);
            }
            else
            {
                for (int i = 1; i < n-2; i++) {
                    s = (s*2 + 2) % 1000000007;
                }
                System.out.print(s);
            }
        }
        else {
            System.out.print(0);
        }
    }
}
