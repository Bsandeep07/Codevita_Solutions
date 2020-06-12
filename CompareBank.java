import java.util.Scanner;

public class CompareBank {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        long principleAmount = scanner.nextInt();
        int tenure = scanner.nextInt();
        //bank 1 inputs
        int noOfBank1Slabs = scanner.nextInt();
        int[] bank1Years = new int[noOfBank1Slabs];
        float[] bank1InterestRates = new float[noOfBank1Slabs];
        for (int i = 0; i < noOfBank1Slabs; i++) {
            bank1Years[i] = scanner.nextInt();
            bank1InterestRates[i] = scanner.nextFloat();
        }
        //bank 2 inputs
        int noOfBank2Slabs = scanner.nextInt();
        int[] bank2Years = new int[noOfBank2Slabs];
        float[] bank2InterestRates = new float[noOfBank2Slabs];
        for (int i = 0; i < noOfBank2Slabs; i++) {
            bank2Years[i] = scanner.nextInt();
            bank2InterestRates[i] = scanner.nextFloat();
        }

        //choosing the bank
        //for bank 1
        int totalAmountForBank1 = 0;
        for (int i = 0; i < noOfBank1Slabs; i++) {
            int year = bank1Years[i];
            float rate = bank1InterestRates[i];
            totalAmountForBank1 += principleAmount * rate / (1 - 1 / Math.pow((1 + rate),(year * 12)));
        }

        //for bank 2
        int totalAmountForBank2 = 0;
        for (int i = 0; i < noOfBank2Slabs; i++) {
            int year = bank2Years[i];
            float rate = bank2InterestRates[i];
            totalAmountForBank2 += principleAmount * rate / (1 - 1 / Math.pow((1 + rate), (year * 12)));
        }

        //comparing two banks
        if (totalAmountForBank1 < totalAmountForBank2)
        {
            System.out.print("Bank A");
        }
        else {
            System.out.print("Bank B");
        }
    }
}
