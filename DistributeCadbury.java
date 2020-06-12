import java.util.Scanner;

public class DistributeCadbury {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int minLength = scanner.nextInt();
        int maxLength = scanner.nextInt();
        int minWidth = scanner.nextInt();
        int maxWidth = scanner.nextInt();

        //calculating number of students
        int count = 0;
        int total = 0;
        for (int i = minLength; i <= maxLength; i++) {
            total = i * minWidth;
            count = count + squares(total);
            total = i * maxWidth;
            count = count + squares(total);
        }
        System.out.print(count);
    }

    public static int squares(float n)
    {
        return (int)Math.sqrt(n);
    }
}
