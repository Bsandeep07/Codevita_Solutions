import java.util.Scanner;

public class FireForest {
    static int totalminute = 0, newRow = 0, newCol = 0;
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        char[][] forest = new char[row][col];
        int fireRow = scanner.nextInt();
        int fireCol = scanner.nextInt();
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                forest[r][c] = scanner.next().charAt(0);
            }
        }

        //calculaing time
        System.out.print(calculateTime(fireRow-1,fireCol-1,forest));
        System.out.println();
        System.out.println(newRow + " " + newCol);
    }

    public static int calculateTime(int x , int y, char[][] forest)
    {
        int rowSize = forest[0].length - 1;
        int colSize = forest.length - 1;
        if (forest[x][y] == 'T')
        {
            totalminute++;
            forest[x][y] = 'V';
        }
        //1
        if (rowSize>=x-1 && x-1 > -1 && colSize>=y-1 && y-1 > -1)
        {
            if (forest[x-1][y-1] == 'T')
            {
                forest[x-1][y-1] = 'V';
                newRow = x-1;
                newCol = y-1;
            }
        }
        //2
        if (rowSize>=x-1 && x-1 > -1 && colSize>=y)
        {
            if (forest[x-1][y] == 'T')
            {
                forest[x-1][y] = 'V';
                newRow = x-1;
                newCol = y;
            }
        }
        //3
        if (rowSize>=x-1 && x-1 > -1 && colSize>=y+1)
        {
            if (forest[x-1][y+1] == 'T')
            {
                forest[x-1][y+1] = 'V';
                newRow = x-1;
                newCol = y+1;
            }
        }
        //4
        if (rowSize>=x && colSize>=y-1 && y-1 > -1)
        {
            if (forest[x][y-1] == 'T')
            {
                forest[x][y-1] = 'V';
                newRow = x;
                newCol = y-1;
            }
        }
        //5
        if (rowSize>=x && colSize>=y+1)
        {
            if (forest[x][y+1] == 'T')
            {
                forest[x][y+1] = 'V';
                newRow = x;
                newCol = y+1;
            }
        }
        //6
        if (rowSize>=x+1 && colSize>=y-1 && y-1 > -1)
        {
            if (forest[x+1][y-1] == 'T')
            {
                forest[x+1][y-1] = 'V';
                newRow = x+1;
                newCol = y-1;
            }
        }
        //7
        if (rowSize>=x+1 && colSize>=y)
        {
            if (forest[x+1][y] == 'T')
            {
                forest[x+1][y] = 'V';
                newRow = x+1;
                newCol = y;
            }
        }
        //8
        if (rowSize>=x+1 && colSize>=y+1)
        {
            if (forest[x+1][y+1] == 'T')
            {
                forest[x+1][y+1] = 'V';
                newRow = x+1;
                newCol = y+1;
            }
        }
        if (x != newRow || y != newCol)
        {
            totalminute++;
            System.out.print(x + " " + y);
            calculateTime(newRow,newCol,forest);
        }
        return totalminute;
    }
}