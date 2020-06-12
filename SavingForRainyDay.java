import java.util.Scanner;

public class SavingForRainyDay {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int amountPerMonth = scanner.nextInt();
        int months = scanner.nextInt();
        float rateOfInterest = scanner.nextFloat();

        float requiredMoney,amount,interest;

        if (amountPerMonth <= 0 || months <= 0 || rateOfInterest < 0)
        {
            System.out.print(0);
        }
        else {
            requiredMoney = amountPerMonth;
            while(months != 0)
            {
                amount = requiredMoney / (1 + rateOfInterest /(float) 1200);
                interest = requiredMoney - amount;
                requiredMoney = requiredMoney + (amountPerMonth - interest);
                months-- ;
            }
            requiredMoney -= amountPerMonth;
            double finalAmount = Math.ceil(requiredMoney - 0.5);
            if (finalAmount > requiredMoney)
            {
                finalAmount = Math.ceil(requiredMoney);
            }
            else {
                finalAmount = Math.floor(requiredMoney);
            }
            System.out.print(finalAmount);
        }
    }
}
