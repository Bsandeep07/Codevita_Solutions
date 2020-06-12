import java.util.Scanner;

public class marathon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int total_members = scan.nextInt();
        int total_members = 3;
        //int total_time = scan.nextInt();
        int total_time = 8;
        int scores[][] = {{2,2,4,3,5,2,6,2,3},{3,5,7,4,3,9,3,2,2},{1,2,4,2,7,5,3,2,4}};
//        int scores[][] = new int[total_members][total_time + 1];
//        for(int i=0;i<total_members;i++)
//        {
//            for (int j=0;j<total_time;j++)
//            {
//                scores[i][j] = scan.nextInt();
//            }
//        }
        int check_time = total_time % 2 == 0 ? (total_time / 2) -1 : total_time / 2;
        int output[][] = new int[total_members][ check_time];
        int check_condition = total_time % 2 == 0 ? total_time-3 : total_time-2;
        int final_score[] = new int[total_members];
        int value=0;
        for(int x=0;x<total_members;x++)
        {
            for (int y=0;y<total_time-1;y++)
            {
                value = value + scores[x][y] * scores[x][total_time];
                if(y%2 != 0 && y <= check_condition)
                {
                    output[x][y/2] = value;
                }
            }
            value = 0;
        }
        int highest[] = new int[2];
        int winner = 0;
        for(int a=0;a<total_members;a++)
        {
            for (int b=0;b<check_time;b++)
            {
                if(output[b][a] > highest[0])
                {
                    highest[0] = output[b][a];
                    highest[1] = b;
                }
            }
            for(int c=0;c<check_time;c++)
            {
                if(output[c][a] == highest[0])
                {
                    final_score[c]++;
                }
            }
            highest[0] = 0;
            highest[1] = 0;
        }
        int greastest = 0;
        for(int f=0;f<total_members;f++)
        {
            if(final_score[f] > greastest)
            {
                greastest = final_score[f];
            }
        }
        for(int g=0;g<total_members;g++)
        {
            if(final_score[g] == greastest)
            {
                winner = g;
                break;
            }
        }
        System.out.println(winner+1);
    }
}
