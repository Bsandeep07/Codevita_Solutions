import java.util.Scanner;

public class DistributeCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //implementing logic
        int numberOf5RupeeCoin = (n - 4) / 5;
        int valueOf5RupeeCoin = numberOf5RupeeCoin * 5;
        int numberOf1RupeeCoin;
        if ((n - valueOf5RupeeCoin) % 2 == 0)
        {
            numberOf1RupeeCoin = 2;
        }
        else {
            numberOf1RupeeCoin = 1;
        }
        int numberOf2RupeeCoin = (n - valueOf5RupeeCoin - numberOf1RupeeCoin) / 2;

        System.out.print(numberOf5RupeeCoin+numberOf2RupeeCoin+numberOf1RupeeCoin + " ");
        System.out.print(numberOf5RupeeCoin + " " + numberOf2RupeeCoin + " " + numberOf1RupeeCoin);
    }
}
