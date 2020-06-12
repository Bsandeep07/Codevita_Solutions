import java.util.Scanner;

public class MinProduct {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //taking input
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] array_1  = new long[n];
        long[] array_2 = new long[n];
        array_1 = getInput(n);
        array_2 = getInput(n);

        //calculating minimum product
        long temp = 0;
        long diff = 0;
        long res = 0;

        for (int i = 0; i < n; i++) {
            long pro = array_1[i] * array_2[i];
            res = res + pro;
            if (pro < 0 && array_2[i] < 0)
                temp = (array_1[i] + 2*k)*array_2[i];
            else if (pro < 0 && array_1[i] < 0)
                temp = (array_1[i] - 2*k)*array_2[i];
            else if (pro > 0 && array_1[i] < 0)
                temp = (array_1[i] + 2*k)*array_2[i];
            else if (pro > 0 && array_1[i] > 0)
                temp = (array_1[i] - 2*k)*array_2[i];

            long d = pro - temp;
            if (d > diff)
                diff = d;
        }
        System.out.print(res-diff);

    }

    static long[] getInput(int size){
        long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLong();
        }
        return array;
    }
}
