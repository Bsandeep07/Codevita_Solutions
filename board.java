import java.util.*;
public class board {
    public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
      	 //int count = scan.nextInt();
         int count = 5;
         
      	 int score = 0;
         
      	 //int board[][] = new int[count][count];
      	 //int board[][] = {{0,3,9,6},{1,4,4,5},{8,2,5,4},{1,8,5,9}};
        int board[][] = {{0,82,2,6,7},{4,3,1,5,21},{6,4,20,2,8},{6,6,64,1,8},{1,65,1,6,4}};
//         for(int i=0;i<count;i++)
//         {
//          	for(int j=0;j<count;j++)
//            {
//              board[i][j] = scan.nextInt();
//            }
//         }
         
      	//calculating smallest score
      	int row = 0 , col = 0;
      	while(row < count){
                if(col == count-1 && row < count-1)
                {
                  score = (score / 2) + board[row][col];
                  row++;
                }
                if(row == count-1 && col == count-1)
                {
                    score = ( score / 2) + board[row][col];
                    row++;
                }
                else if(row == count-1 && col < count-1)
                {
                    row++;
                }
                if(row < count-1 && col < count-1)
                {
                    if(board[row+1][col] <= board[row][col+1])
                    {
                        score = ( score / 2 ) + board[row+1][col];
                        row++;
                    }
                    else
                    {
                        score = ( score / 2 ) + board[row][col+1];
                        col++;
                    }
                }
        }
        System.out.print(score);
    }
}
