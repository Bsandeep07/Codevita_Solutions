import java.util.Scanner;

public class PascalPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int n = 8;
        //String[] input = {"10","4","74","61","8","37","2","35"};
        int[] inputs = new int[n];
        String[] input = new String[n];
        for (int p=0;p<n;p++)
        {
            input[p] = scan.next();
        }
        //string to integer
        for (int i = 0; i < input.length; i++) {
            inputs[i] = Integer.parseInt(input[i]);
        }
        //sorting
        for (int c = 0; c < inputs.length - 1; c++) {
            for (int b = 0; b < inputs.length - c - 1; b++) {
                if (inputs[b] < inputs[b + 1]) {
                    int temp = inputs[b];
                    inputs[b] = inputs[b + 1];
                    inputs[b + 1] = temp;
                }
            }
        }
        //arranging elements
        int first = 0,last = 4;
        for (int e = 0;e<3;e++)
        {
            int temp = inputs[last];
            if (last == first)
            {
                int t = inputs[2];
                inputs[2] = inputs[3];
                inputs[3] = t;
                break;
            }
            for (int s = last ; s > first;s--)
            {
                inputs[s] = inputs[s-1];
            }
            inputs[first] = temp;
            first++;
            last--;
        }
        //adding elements
        int end = 4;
        for (int a =0 ;a < 4 ;a++)
        {
            for (int b =0; b <= end;b++)
            {
                inputs[b] = inputs[b] + inputs[b+1];
            }
            end--;
        }
        //printing elements
            System.out.print(inputs[0]*inputs[1]);
    }
}