import java.util.Arrays;
import java.util.Scanner;

public class CountingRocks {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int numberOfSamples = scanner.nextInt();
        int numberOfRanges = scanner.nextInt();
        int[] samples = new int[numberOfSamples];
        int[] ranges = new int[numberOfRanges*2];
        int[] output = new int[numberOfRanges];
        for (int i = 0; i < numberOfSamples; i++) {
            samples[i] = scanner.nextInt();
        }
        Arrays.sort(samples);

        //calculating rocks
        int count = 0;
        for (int i = 0; i < numberOfRanges ; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            for (int j = 0; j < numberOfSamples && samples[j] <= end; j++) {
                if (samples[j] >= start && samples[j] <= end)
                {
                    count++;
                }
            }
            output[i] = count;
            count = 0;
        }
        for(int i=0;i<numberOfRanges;i++)
        {
            System.out.print(output[i]);
        }
    }
}