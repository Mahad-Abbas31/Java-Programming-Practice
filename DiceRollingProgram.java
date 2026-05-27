import java.util.Scanner;
import java.util.Random;

public class DiceRollingProgram{
    public static void dice(int num){
        Random random = new Random();
        int total = 0;

        if(num>0){
            for(int i=1; i<=num; i++){    
                int op;
                op = random.nextInt(1,7);

                switch (op)
                {
                    case 1:
                        System.out.print(" ________\n");
                        System.out.print("|        |\n");
                        System.out.print("|    ●   |\n");
                        System.out.print("|        |\n");
                        System.out.print(" --------\n");
                        total = total + 1;
                        break;
                    case 2:
                        System.out.print(" ________\n");
                        System.out.print("|  ●     |\n");
                        System.out.print("|        |\n");
                        System.out.print("|      ● |\n");
                        System.out.print(" --------\n");
                        total = total + 2;
                        break;
                    case 3:
                        System.out.print(" ________\n");
                        System.out.print("|  ●     |\n");
                        System.out.print("|    ●   |\n");
                        System.out.print("|      ● |\n");
                        System.out.print(" --------\n");
                        total = total + 3;
                        break;
                    case 4:
                        System.out.print(" ________\n");
                        System.out.print("|  ●  ●  |\n");
                        System.out.print("|        |\n");
                        System.out.print("|  ●  ●  |\n");
                        System.out.print(" --------\n");
                        total = total + 4;
                        break;
                    case 5:
                        System.out.print(" ________\n");
                        System.out.print("|  ●   ● |\n");
                        System.out.print("|    ●   |\n");
                        System.out.print("|  ●   ● |\n");
                        System.out.print(" --------\n");
                        total = total + 5;
                        break;
                    case 6:
                        System.out.print(" ________\n");
                        System.out.print("|  ●   ● |\n");
                        System.out.print("|  ●   ● |\n");
                        System.out.print("|  ●   ● |\n");
                        System.out.print(" --------\n");
                        total = total + 6;
                        break;
                    default:
                        System.out.print("Error!!!\n");
                        break;
                }
            }
        }else{
            System.out.println("Enter a Number greater than 0");
        }
        System.out.println("Total Score: " + total);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("How Many DICE You Want to Roll? ");
        num = scanner.nextInt();
        
        dice(num);

        scanner.close();
    }
}