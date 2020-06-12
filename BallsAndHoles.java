import java.util.Scanner;

public class BallsAndHoles {
    public static void main(String[] args) {
        //taking input
        Scanner scanner = new Scanner(System.in);
        long numberOfHoles = scanner.nextLong();
        long[] diameterOfHoles = new long[(int)numberOfHoles];
        for (int hole = 0; hole < numberOfHoles; hole++) {
            diameterOfHoles[hole] = scanner.nextLong();
        }
        long numberOfBalls = scanner.nextLong();
        long[] diameterOfBalls = new long[(int)numberOfBalls];
        for (int ball = 0; ball < numberOfBalls; ball++) {
            diameterOfBalls[ball] = scanner.nextLong();
        }

        //picking up balls
        long[] numberOfBallsInHoles = new long[(int)numberOfHoles];
        for (int ball = 0; ball < numberOfBalls; ball++) {
            long diameterOfBall = diameterOfBalls[ball];
            boolean flag = false;
            for (int hole = diameterOfHoles.length-1; hole > -1 ; hole--) {
                long diameterOfHole = diameterOfHoles[hole];
                if (diameterOfBall <= diameterOfHole && numberOfBallsInHoles[hole] < hole+1)
                {
                    numberOfBallsInHoles[hole]++;
                    flag = true;
                    System.out.print(hole+1 + " ");
                    break;
                }
            }
            if (!flag)
            {
                System.out.print(0 + " ");
            }
        }
    }
}
// 20 15 5 7 10 4 2 1 3 6 8