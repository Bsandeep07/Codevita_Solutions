import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input[] = new int[n];
        for (int i=0;i<n-1;i++)
        {
            input[i] = scan.nextInt();
        }
        input[n - 1] = scan.nextInt();
        for (int pattern = 0 ; pattern < n ; pattern++)
        {
            int value = input[pattern];
            for (int row=0;row<=value;row++)
            {
                for (int col=0;col<row;col++)
                {
                    System.out.print(col+1 + " ");
                }
                if(row != value)
                    System.out.println();
            }
        }
    }
}
