import java.util.Scanner;

public class SimilarChar {
    public static void main(String[] args) {
        //taking inputs
        Scanner  scan = new Scanner(System.in);
        int n = scan.nextInt();
        char input[] = new char[n];
        String data = scan.next();
        input = data.toCharArray();
        int queries = scan.nextInt();
        int charPositions[] = new int[queries];
        for (int i = 0; i < queries; i++) {
            charPositions[i]  = scan.nextInt();
        }

        //finding repeatations
        for (int i = 0; i < charPositions.length; i++) {
            char value = input[charPositions[i]-1];
            int repeatation = 0;
            for (int j = 0; j < charPositions[i] - 1; j++) {
                if (value == input[j])
                {
                    repeatation++;
                }
            }
            System.out.println(repeatation);
        }
    }
}
