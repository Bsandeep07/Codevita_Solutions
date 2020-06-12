import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivineDivisors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0)
//            {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.print(n);

        //optimized way
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0)
            {
                if (n/i == i)
                {
                    System.out.print(i);
                }
                else {
                    System.out.print(i + " ");
                    arrayList.add(i);
                }
            }
        }
        System.out.print(" ");
        Collections.reverse(arrayList);
        for (int value: arrayList) {
            System.out.print(n / value + " ");
        }
    }
}
