import javax.print.DocFlavor;
import java.util.Scanner;

public class LexiString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char p[][] = new char[n][26];
        char s[][] = new char[n][];
        int indexes[][] = new int[n][];
        //taking inputs
        for (int i=0;i<n;i++)
        {
            p[i] = scan.next().toCharArray();
            String temp = scan.next();
            s[i] = new char[temp.length()];
            s[i] = temp.toCharArray();
        }
        //finding lexicography
        for (int i = 0; i < n; i++) {
            indexes[i] = new int[s[i].length];
            for (int j = 0; j < s[i].length; j++) {
                 char temp =  s[i][j] ;
                for (int k = 0; k < 26; k++) {
                    if (temp == p[i][k])
                    {
                        indexes[i][j] = k;
                        break;
                    }
                }
            }
        }
        //sorting indexes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < indexes[i].length - 1; j++) {
                for (int k = 0; k < indexes[i].length - j - 1; k++) {
                    if (indexes[i][k] > indexes[i][k + 1])
                    {
                        int temp = indexes[i][k];
                        indexes[i][k] = indexes[i][k+1];
                        indexes[i][k+1] = temp;
                    }
                }
            }
        }
        //printing final output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < indexes[i].length; j++) {
                System.out.print(p[i][indexes[i][j]]);
            }
            System.out.println();
        }
    }
}
