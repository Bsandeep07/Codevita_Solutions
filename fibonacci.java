import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args)
        {
            int first=0,second=1,sum=0,n;
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            int values[] = new int[n];
            for(int x=0;x<n;x++)
            {
                values[x] = scan.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(first + " " + second + " ");
                for (int i=0;i<values[j]-2;i++)
                {
                    sum=first+second;
                    first=second;
                    second=sum;
                    System.out.print(sum + " ");
                }
                System.out.println(" ");
                sum=0;
                first = 0;
                second = 1;
            }
        }
}
