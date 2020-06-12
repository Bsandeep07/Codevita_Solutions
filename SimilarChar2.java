import java.util.Scanner;

public class SimilarChar2 {
    public static void main(String[] args) {

        //taking inputs
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char input[] = new char[n];
        String data = scan.next();
        input = data.toCharArray();

        //filling arrays
        char alphabets[] = new char[26];
        int repeatations[] = new int[26];
        int count = 0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<input.length;j++)
            {
                if (alphabets[j] == input[i])
                {
                    repeatations[j]++;
                    break;
                }
                if (alphabets[j] == '\0')
                {
                    alphabets[j] = input[i];
                    count++;
                    repeatations[j]++;
                    break;
                }
            }
        }

        //defining indexes array column length
        int indexes[][] = new int[count][];
        for (int i = 0; i < count; i++) {
            indexes[i] = new int[repeatations[i]];
        }

        int arrayRow = 0;
        //iterate through inputs
        for (int i = 0; i < n; i++) {

            //finding from alphabets
            arrayRow = getAlphabetIndex(input[i] , alphabets);

            //filling indexes array
            for (int col=0;col<indexes[arrayRow].length;col++)
            {
                if (indexes[arrayRow][col] == 0)
                {
                    indexes[arrayRow][col] = i + 1;
                    break;
                }
            }
        }

        //taking queries
        int queries = scan.nextInt();
        int charPositions[] = new int[queries];
        for(int i = 0; i < queries; i++) {
            charPositions[i]  = scan.nextInt();
        }

        //tracking queries
        for (int i = 0; i < queries; i++) {
            int index = getAlphabetIndex(input[charPositions[i] - 1], alphabets);

            for (int j = 0; j < indexes[index].length;j++)
            {
                if (indexes[index][j] == charPositions[i])
                {
                    System.out.println(j);
                    break;
                }
            }
        }

    }

    public static int getAlphabetIndex(char a , char[] alphabets)
    {
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (a == alphabets[i])
            {
                index = i;
                break;
            }
        }
        return index;
    }
}
