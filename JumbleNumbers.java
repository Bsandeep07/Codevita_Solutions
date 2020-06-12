import java.util.Scanner;

public class JumbleNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input[] = new int[3];
        int flag = 0;
        for (int i=0;i<3;i++)
        {
            try {
                input[i] = scan.nextInt();
            } catch (Exception e)
            {
                System.out.println("Invalid Input");
                return;
            }
        }
        if(input[0] < 0 || input[1] < 0 || input[0] > 1000000 || input[1] > 1000000)
        {
            System.out.println("Invalid Input");
            return;
        }
        for (int n = 1; n <= input[1] ; n++)
        {
            int value = n * (2 * n - 1);
            if (value >= input[0] && value <= input[1])
            {
                flag++;
                if (flag == input[2])
                {
                    System.out.println(value);
                    return;
                }
            }
        }
            System.out.println("No number is present at this index");
    }
}
