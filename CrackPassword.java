import java.util.Scanner;

public class CrackPassword {
    public static void main(String[] args) {
        //taking input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int hour[] = new int[n];
        int minute[] = new int[n];
        char alphabets[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char output[][] = new char[n][10];
        for (int i = 0; i < n; i++) {
            String input[] = scan.next().split(":");
            hour[i] = Integer.parseInt(input[0]);
            minute[i] = Integer.parseInt(input[1]);
        }

        //calculating total sum using formula
        char o[] = new char[10];
        for (int i = 0; i < n; i++) {
            int a = hour[i];
            int total = hour[i];
            for (int j = 0; j < minute[i]; j++) {
                a = a * 2 - 1;
                total += a;
            }
            int t = 0;
            while (total > 0){
                o[t] = alphabets[total % 10] ;
                total /= 10;
                t++;
            }
            for (int j = t; j > -1 ; j--) {
                System.out.print(o[j]);
            }
            if (i < n-1)
                System.out.println();
            o = new char[10];
        }
    }
}
