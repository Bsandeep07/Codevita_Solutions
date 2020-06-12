import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CloseFriends {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        int numberOfFriends = scanner.nextInt();
        int numberOfFlats = scanner.nextInt();
        long payingCapacity = scanner.nextLong();
        int[][] flatConnections = new int[numberOfFlats][numberOfFlats];
        List<Integer> capacityOfFlats = new ArrayList<>();
        int[] rent = new int[numberOfFlats];
        //for flat connections
        for (int row = 0; row < numberOfFlats; row++) {
            for (int col = 0; col < numberOfFlats; col++) {
                flatConnections[row][col] = scanner.nextInt();
            }
        }
        //for capacity of flats
        for (int i = 0; i < numberOfFlats; i++) {
            capacityOfFlats.add(scanner.nextInt());
        }
        //for rent input
        for (int i = 0; i < numberOfFlats; i++) {
            rent[i] = scanner.nextInt();
        }


    }
}
