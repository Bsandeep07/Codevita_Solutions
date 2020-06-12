import java.util.Scanner;

public class SittingArrangements {
    public static void main(String[] args) {
        //taking inputs
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfTables = scanner.nextInt();
            int numberOfAttendees = scanner.nextInt();
            int PA = 0,PB = 0,TA = 0, TB = 0;
            long[] fact = new long[numberOfAttendees+2];
            long divide = 0,arrange = 0;

            if (numberOfTables >= numberOfAttendees) {
                System.out.print(1);
            } else {
                PA = numberOfAttendees / numberOfTables;
                PB = PA + 1;
                TA = numberOfAttendees % numberOfTables;
                TB = numberOfTables - TA;
                fact[0] = 1;
                for (int j = 1; j <= numberOfAttendees +1 ; j++) {
                    fact[j] = j * fact[j-1];
                }
                divide = (long) (fact[numberOfAttendees] / (Math.pow(fact[PA],TA) * Math.pow(fact[PB],TB) * fact[TA] * fact[TB]));
                if (PB >= 4)
                {
                    arrange = (long) (divide * (Math.pow(fact[PA-1] / 2 , TA) * Math.pow(fact[PB-1]/2 , TB)));
                }
                else {
                    arrange = divide;
                }
                System.out.println(arrange);
            }
        }
    }
}
