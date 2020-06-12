import java.util.Arrays;
import java.util.Scanner;

public class Zombie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking number of test cases
        int n = scanner.nextInt();
        for (int testCases = 0; testCases < n; testCases++) {
            //taking input values
            int numberOfZombie = scanner.nextInt();
            int maxPlayTime = scanner.nextInt();
            int[] energyOfZombie = new int[numberOfZombie];
            for (int energy = 0; energy < numberOfZombie; energy++) {
                energyOfZombie[energy] = scanner.nextInt();
            }
            int initialPlayerEnergy = scanner.nextInt();
            int minEnergyToWin = scanner.nextInt();

            //sorting array
            for(int c = 0;c<numberOfZombie-1 ; c++)
            {
                for(int b = 0 ; b< numberOfZombie-c-1 ;b++)
                {
                    if(energyOfZombie[b] > energyOfZombie[b + 1])
                    {
                        int temp = energyOfZombie[b];
                        energyOfZombie[b] = energyOfZombie[b + 1];
                        energyOfZombie[b + 1] = temp;
                    }
                }
            }

            //calculating energy
            if (maxPlayTime >= numberOfZombie)
            {
                for (int i = 0; i < numberOfZombie; i++) {
                    if (initialPlayerEnergy > energyOfZombie[i])
                    {
                        initialPlayerEnergy += initialPlayerEnergy - energyOfZombie[i];
                    }
                }
            }
            if (minEnergyToWin <= initialPlayerEnergy)
            {
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
    }
}
