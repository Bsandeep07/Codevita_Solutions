import java.util.Scanner;

public class ZombieWorld2 {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        long initPlayerEnergy = scanner.nextLong();
        long numberOfZombies = scanner.nextLong();
        long[] zombieEnergy = new long[(int) numberOfZombies];
        for (int i = 0; i < numberOfZombies; i++) {
            zombieEnergy[i] = scanner.nextInt();
        }

        //calculating scores
        int status = 1;
        for (int i = 0; i < numberOfZombies; i++) {
            initPlayerEnergy -= (zombieEnergy[i] % 2) + (zombieEnergy[i] / 2);
        }
        if (initPlayerEnergy > 0)
        {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
