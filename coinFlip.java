import java.util.Random;
import java.util.Scanner;
public class coinFlip {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int coin;
        int flip;

        do{
            System.out.println("1. Flip the Coin");
            System.out.println("0. EXIT");
            flip = scanner.nextInt();

            if(flip == 1){   
                coin = random.nextInt(0,2);
                if(coin==0)
                    System.out.println("HEADS\n----------------------------------");
                else
                    System.out.println("TALES\n----------------------------------");
            }
        }while(flip != 0);

        scanner.close();
    }    
}
