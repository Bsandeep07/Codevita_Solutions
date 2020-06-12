import java.util.Scanner;

public class CyclicPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int cycle = 0;
        for (int i = 0; i < testCases; i++) {
            String string = scanner.next();
            if (checkPalindrome(string) == 1)
            {
                System.out.println(0);
                continue;
            }
            char[] sequence = string.toCharArray();
            char[] sequence2 = string.toCharArray();
            int length = sequence.length;
            int a = 0,b=0;
            for (int j = 0; j < length; j++) {
                //check from start
                char temp = sequence[0];
                for (int k = 0; k <= length - 2; k++) {
                    sequence[k] = sequence[k+1];
                }
                sequence[length-1] = temp;
                String newSequence = new String(sequence);
                if (checkPalindrome(newSequence) == 1)
                {
                    a++;
                    cycle = a;
                    break;
                }

                //check from end
                char temp2 = sequence2[length - 1];
                for (int k = length - 1; k > 0 ; k--) {
                    sequence2[k] = sequence2[k-1];
                }
                sequence2[0] = temp2;
                String newSequence2 = new String(sequence2);
                if (checkPalindrome(newSequence2) == 1)
                {
                    b++;
                    cycle  = b;
                    break;
                }
                a++;
                b++;
            }
            System.out.println(cycle == 0 ? -1 : cycle);
            cycle = 0;
        }
    }

    static int checkPalindrome(String string)
    {
        char[] sequence = string.toCharArray();
        String temp = "";
        for (int i = string.length() - 1; i > -1; i--) {
            temp = temp + sequence[i];
        }
        return string.equals(temp)? 1 : 0;
    }
}
