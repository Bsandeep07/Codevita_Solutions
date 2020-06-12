
import java.util.Scanner;

public class QuestionPaper {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input[] = new int[6];
        String c1="",c2;
        int i = 0,without_c;
        while( i < 8)
        {
            if(i < 6)
            {
                input[i] = scan.nextInt();
                i++;
            }
            else
            {
                c1 = scan.nextLine();
                i++;
            }
        }
        c2 = scan.next();
        System.out.println(withoutConstraint(input));
    }
    public static int factorial(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f = f * i;
        }
        return f;
    }
    public static int withoutConstraint(int[] input)
    {
        int simple,medium,complex;
        simple = factorial(input[0]) / (factorial(input[1]) * factorial(input[0] - input[1]));
        medium = factorial(input[2]) / (factorial(input[3]) * factorial(input[2] - input[3]));
        complex = factorial(input[4]) / (factorial(input[5]) * factorial(input[4] - input[5]));
        return simple*medium*complex;
    }
}
