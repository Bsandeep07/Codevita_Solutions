import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestFactor {
    public static void main(String[] args) {
        //taking output
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list =  new ArrayList<>();
        int count = 0;
        long output = 1;
        int index = 0;


        //calculating output
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0)
            {
                if (n / i == i)
                {
                    count++;
                    if (count == k)
                    {
                        System.out.print(i);
                        break;
                    }
                }
                else {
                    count++;
                    if (count == k)
                    {
                        System.out.print(n/i);
                        break;
                    }
                    list.add(i);
                }
            }
        }
        if (count * 2 <= k || k <= 0)
        {
            System.out.print(1);
            return;
        }
        if (count < k)
        {
            index = k - count;
            System.out.print(list.get(list.size() - index));
        }
    }
}
