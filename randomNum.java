import java.util.Random;
public class randomNum{
    public static void main(String[] arg){
        Random random = new Random();
        int num1;

        num1 = random.nextInt();                // ____ Problem: Very Large No.
        System.out.print(num1);

        num1 = random.nextInt(1,7);         // 1st term is inclusive while 2nd is exclusive
    }
}