import java.util.Scanner;

public class SortingBoxes {
    public static void main(String[] args) {
        //taking inputs
        Scanner scan = new Scanner(System.in);
        int numberOfBoxes = scan.nextInt();
        int officePosition = scan.nextInt();
        int boxWeights[] = new int[numberOfBoxes];
        int sortedWeights[] = new int[numberOfBoxes];
        for (int i = 0; i < numberOfBoxes; i++) {
            boxWeights[i] = scan.nextInt();
        }

        //sorting boxes
        sortedWeights = boxWeights;
        for (int i = 0; i <numberOfBoxes - 1 ; i++) {
            for (int j = 0; j < numberOfBoxes - i - 1; j++) {
                if (boxWeights[j] > boxWeights[j+1])
                {
                    int temp = boxWeights[j];
                    boxWeights[j] = boxWeights[j+1];
                    boxWeights[j+1] = temp;
                }
            }
        }

        int temp = sortedWeights[numberOfBoxes-1];
        for (int i = numberOfBoxes - 1; i >= officePosition - 1; i--) {
            sortedWeights[i] = sortedWeights[i-1];
        }
        sortedWeights[officePosition-1] = temp;

        //printing sorted array
        for (int i = 0; i < sortedWeights.length; i++) {
            System.out.print(boxWeights[i]);
        }
    }
}
