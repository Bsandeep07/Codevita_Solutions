import java.util.Scanner;

public class CustomChessboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String input[] = new String[n * 2];
        for (int i = 0; i < n * 2; i++) {
            input[i] = scan.next();
        }
        boolean flag = true;
        for (int board = 0;board < n*2 ; board += 2)
        {
            int size =Integer.valueOf(input[board]);
            String startCharacter = input[board+1];
            if (startCharacter.equals("W"))
            {
                flag = true;
            }
            else {
                flag = false;
            }
            for (int row=0;row<size;row++)
            {
                for (int col = 0;col<size;col++)
                {
                    if (flag == true)
                    {
                        System.out.print("W");
                        flag = false;
                    }
                    else {
                        System.out.print("B");
                        flag = true;
                    }
                }
                System.out.println(" ");
                if(size % 2 == 0)
                {
                    if (flag == true)
                    {
                        flag = false;
                    }
                    else
                    {
                        flag = true;
                    }
                }
            }
        }
    }
}