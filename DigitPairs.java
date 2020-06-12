import java.util.Scanner;

public class DigitPairs {
    public static void main(String[] args) {
        //taking input
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        //int totalNumberOfValues[] = new int[n];
//        int totalNumberOfValues[] = {8,7,12};
//        int actualValues[][] = new int[n][];
//        int bitScores[][] = new int[n][];
       // int output[] = new int[n];
        //taking values
//        for (int input = 0;input < n;input++)
//        {
//            totalNumberOfValues[input] = scan.nextInt();
//            actualValues[input] = new int[totalNumberOfValues[input]];
//            bitScores[input] = new int[totalNumberOfValues[input]];
//            for (int value = 0;value < totalNumberOfValues[input];value++)
//            {
//                actualValues[input][value] = scan.nextInt();
//            }
//        }

        //automatic input
        int n = 3;
        int totalNumberOfValues[] = {8,7,12};
        int actualValues[][] = {{234 ,567 ,321 ,345 ,123 ,110 ,767 ,111},{279, 420, 427, 437, 566, 572, 921},{154, 252, 320, 586, 590, 613, 743, 814, 824, 868, 902, 936}};
        int bitScores[][] = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0,0,0}};
        int output[] = new int[n];

        //finding bit scores
        int smallest = 9 , largest = 0;
        for (int row = 0;row<n;row++)
        {
            for (int col = 0;col < totalNumberOfValues[row];col++)
            {
               while(actualValues[row][col] > 0)
               {
                   int digit;
                   digit = actualValues[row][col] % 10;
                   actualValues[row][col] /= 10;

                   if (digit < smallest)
                   {
                       smallest = digit;
                   }
                   if (digit > largest)
                   {
                       largest = digit;
                   }
               }
               bitScores[row][col] = ((largest * 11) + (smallest * 7)) < 100 ? (largest * 11) + (smallest * 7) : ((largest * 11) + (smallest * 7)) % 100 ;
               smallest = 9;
               largest = 0;
            }
        }

        //finding number of pairs
        int even[] = new int[10];
        int odd[] = new int[10];
        for (int row = 0; row < n;row++)
        {
            for (int col = 0 ;col < totalNumberOfValues[row];col++)
            {
                if (col % 2 == 0)
                {
                    even[bitScores[row][col] / 10]++;
                }
                else
                {
                    odd[bitScores[row][col] / 10]++;
                }
            }
            for (int f = 0 ; f < 10 ; f++)
            {
                if (even[f] > 1)
                {
                    output[row] = output[row] + even[f] - 1;
                }
                if (odd[f] > 1)
                {
                    output[row] = output[row] + odd[f] - 1;
                }
            }
            even = new int[10];
            odd = new int[10];
        }

        //printing bit socres
        for (int r = 0 ; r < n ; r++)
        {
            for (int c= 0 ; c < totalNumberOfValues[r];c++)
            {
                System.out.print(bitScores[r][c] + " ");
            }
            System.out.println();
        }

        for (int o = 0; o < n;o++)
        {
            System.out.println(output[o]);
        }
    }
}
