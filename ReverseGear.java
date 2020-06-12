import java.util.Scanner;

public class ReverseGear {
    public static void main(String[] args) {
        //taking input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0)
        {
            System.out.print("Invalid test case");
            return;
        }
        int[][] input = new int[n][4];
        int time = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < 4; col++) {
                input[row][col] = scan.nextInt();
            }

            //constraints
            if (input[row][0] >= input[row][1])
            {
                System.out.println("Cannot park");
                continue;
            }
            if (input[row][0] <= 0 || input[row][1] <= 0 || input[row][2] <= 0 || input[row][3] <= 0)
            {
                System.out.println("Invalid test case");
                continue;
            }

            int currentPosition = input[row][3];
            while (currentPosition > 0)
            {
                //for backward movement
                if (currentPosition < input[row][1])
                {
                    time = time + (input[row][2] * currentPosition);
                    currentPosition = 0;
                    continue;
                }
                currentPosition = currentPosition - input[row][1];
                time = time + (input[row][2] * input[row][1]);
                if (currentPosition <= 0)
                {
                    break;
                }
                //for front movement
                currentPosition = currentPosition + input[row][0];
                time = time + (input[row][2] * input[row][0]);
            }
            System.out.println(time);
            time = 0;
        }
    }
}
