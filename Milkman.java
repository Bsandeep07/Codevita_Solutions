import java.util.Scanner;

public class Milkman {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] demandsOfMilk = new int[testCases];
        for (int testcase = 0; testcase < testCases; testcase++) {
            demandsOfMilk[testcase] = scanner.nextInt();
        }

        //calculating minimum bottles required
        for (int i = 0; i < testCases; i++) {
            int demand = demandsOfMilk[i];
            int totalNumberOfBottle = 0;
            //for demand less than 11
            if (demand > 0 && demand < 11)
            {
                System.out.println(1);
                continue;
            }
            //for min greater than 0
            int demandAfterMod = demand % 10;
            if (demandAfterMod > 0)
            {
                if (demandAfterMod == 1 || demandAfterMod == 5 || demandAfterMod == 7)
                {
                    totalNumberOfBottle++;
                }
                else if ( demandAfterMod < 5)
                {
                    totalNumberOfBottle += demandAfterMod;
                }
                else if (demandAfterMod == 6 || demandAfterMod == 8)
                {
                    totalNumberOfBottle += 2;
                }
                else
                {
                    totalNumberOfBottle += 2;
                }
            }
            //for 10 litre bottles
            int bottleOf10Litre = demand/10;
            totalNumberOfBottle += bottleOf10Litre;
            //printing the result
            System.out.println(totalNumberOfBottle);
        }
    }
}
