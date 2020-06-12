import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            input[i] = scan.nextInt();
        }
        for(int tree = 0;tree<n;tree++) {
            int current_value = input[tree];
            if(current_value <= 1)
            {
                System.out.println("You cannot generate christmas tree");
                continue;
            }
            if(current_value > 20)
            {
                System.out.println("Tree is no more");
                continue;
            }
            //complete tree
            for (int row = 0; row <= current_value; row++) {
                int count = 2 * row + 1;
                int space = current_value - row;
                if (space > 0) {
                    System.out.print(String.format("%" + space + "s", " "));
                }
                for (int col = 0; col < count; col++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            //partial tree
            for (int ptree = current_value - 1; ptree > 1; ptree--) {
                for (int row = 0; row < ptree; row++) {
                    int count = 2 * row + 3;
                    int space = current_value - row - 1;
                    if (space > 0) {
                        System.out.print(String.format("%" + space + "s", " "));
                    }
                    for (int col = 0; col < count; col++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }

            //stand
            for (int stand = 0; stand < 2; stand++) {
                System.out.print(String.format("%" + current_value + "s", " "));
                System.out.println("*");
            }
        }
    }
}
