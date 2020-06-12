import java.util.Scanner;

public class SimpleChessboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }
        boolean flag = true;
        for(int board = 0;board < n;board++) {
            int value = input[board];
            if(value % 2 != 0) {
                for (int row = 0; row < value; row++) {
                    for (int col = 0; col < value; col++) {
                        if (flag == true) {
                            System.out.print("W");
                            flag = false;
                        } else {
                            System.out.print("B");
                            flag = true;
                        }
                    }
                    System.out.println(" ");
                }
                flag = true;
            }
            else {
                for (int row = 0; row < value; row++) {
                    for (int col = 0; col < value; col++) {
                        if (flag == true) {
                            System.out.print("W");
                            flag = false;
                        } else {
                            System.out.print("B");
                            flag = true;
                        }
                    }
                    System.out.println(" ");
                    if (flag == true)
                    {
                        flag = false;
                    }
                    else {
                        flag = true;
                    }
                }
                flag = true;
            }
            }
        }
    }
