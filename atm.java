import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        int n = 10;
        int total_notes=0,required_100notes=0,required_200notes=0,required_500notes=0,required_1000notes,remaining_amount=0,current_value=0;
        //int withdrawal_amount = scan.nextInt();
        int withdrawal_amount = 1300;
        //int notes[] = new int[4];
//        for (int i=0;i<4;i++)
//            notes[i] = scan.nextInt();
        int notes[] = {10,10,10,10};
        //int notes[] = {1,2,2,2};

        // for 100's note
        required_100notes = withdrawal_amount / 100;
        if(required_100notes > 0 && notes[0] > 0)
        {
            if(required_100notes >= notes[0])
            {
                total_notes = total_notes + notes[0];
                current_value = total_notes * 100;
                notes[0] = 0;
            }
            else if(required_100notes < notes[0])
            {
                total_notes = required_100notes;
                current_value = total_notes * 100;
                notes[0] = notes[0] - required_100notes;
            }
        }

        //for 200's note
        remaining_amount = withdrawal_amount - current_value;
        required_200notes = remaining_amount / 200;
        if(remaining_amount > 199 && notes[1] > 0) {
            if (required_200notes >= notes[1] &&  n - total_notes >= notes[1]) {
                total_notes = total_notes + notes[1];
                current_value = current_value + (notes[1] * 200);
                notes[1] = 0;
            }
            else if(required_200notes < notes[1] && n - total_notes >= required_200notes)
            {
                total_notes = total_notes + required_200notes;
                current_value = current_value + (required_200notes * 200);
                notes[1] = notes[1] - required_200notes;
            }
            else if(required_200notes >= notes[1] && n - total_notes < notes[1])
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[1] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value= current_value - 100 + 200;
                        notes[1]--;
                        notes[0]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 200;
                        total_notes++;
                        notes[1]--;
                    }
                }
            }
            else if(required_200notes < notes[1] && n - total_notes < required_200notes)
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[1] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value = current_value - 100 + 200;
                        notes[1]--;
                        notes[0]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 200;
                        total_notes++;
                        notes[1]--;
                    }

                }

            }
        }

        //for 500's note
        remaining_amount = withdrawal_amount - current_value;
        required_500notes = remaining_amount / 500;

        if(remaining_amount > 499 && notes[2] > 0)
        {
            if (required_500notes >= notes[2] &&  n - total_notes >= notes[2]) {
                total_notes = total_notes + notes[2];
                current_value = current_value + (notes[2] * 500);
                notes[2] = 0;
            }
            else if(required_500notes < notes[2] && n - total_notes >= required_500notes)
            {
                total_notes = total_notes + required_500notes;
                current_value = current_value + (required_500notes * 500);
                notes[2] = notes[2] - required_500notes;
            }
            else if(required_500notes >= notes[2] && n - total_notes < notes[2])
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[2] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value= current_value - 200 + 500;
                        notes[2]--;
                        notes[1]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 500;
                        total_notes++;
                        notes[2]--;
                    }
                }
            }
            else if(required_500notes < notes[2] && n - total_notes < required_500notes)
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[2] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value = current_value - 200 + 500;
                        notes[2]--;
                        notes[1]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 500;
                        total_notes++;
                        notes[2]--;
                    }
                }
            }
        }

        //for 1000's note
        remaining_amount = withdrawal_amount - current_value;
        required_1000notes = remaining_amount / 1000;

        if(remaining_amount > 999 && notes[3] > 0)
        {
            if (required_1000notes >= notes[3] &&  n - total_notes >= notes[3]) {
                total_notes = total_notes + notes[3];
                current_value = current_value + (notes[3] * 1000);
                notes[3] = 0;
            }
            else if(required_1000notes < notes[3] && n - total_notes >= required_1000notes)
            {
                total_notes = total_notes + required_1000notes;
                current_value = current_value + (required_1000notes * 1000);
                notes[3] = notes[3] - required_1000notes;
            }
            else if(required_1000notes >= notes[3] && n - total_notes < notes[3])
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[3] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value= current_value - 500 + 1000;
                        notes[3]--;
                        notes[2]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 1000;
                        total_notes++;
                        notes[3]--;
                    }
                }
            }
            else if(required_1000notes < notes[3] && n - total_notes < required_1000notes)
            {
                while(current_value < withdrawal_amount && total_notes <= n && notes[3] > 0)
                {
                    if(total_notes == n)
                    {
                        current_value = current_value - 500 + 1000;
                        notes[3]--;
                        notes[2]++;
                    }
                    else if(total_notes < n)
                    {
                        current_value = current_value + 1000;
                        total_notes++;
                        notes[3]--;
                    }
                }
            }
        }
        else if( remaining_amount < 999 && remaining_amount > 99)
        {
            if((1000 - remaining_amount) % (100 + 200 + 500) == 0)
            {
                current_value = current_value - 100 - 200 - 500 + 1000;
                total_notes = total_notes - 2;
                notes[3]--;
            }
        }

        System.out.println(current_value == withdrawal_amount ? total_notes : 0);
    }
}
