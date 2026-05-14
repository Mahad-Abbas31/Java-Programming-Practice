import java.util.Scanner;
import java.util.Random;
public class guessTheNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rand = random.nextInt(1,101);
        int guess;
        int attempt = 0;


        System.out.println("=========================");
        System.out.println("   🧠Guess the Number    ");
        System.out.println("=========================");
        
        do{
            System.out.println("Enter a Number(Attempts Remaining: " + (7-attempt) + "): ");
            guess = scanner.nextInt();
            
            if(guess==rand)
                System.out.println("🎉 Congratulations! You WON!");
            else if(guess<rand)
                System.out.println("Too Small. Think Bigger");
            else if(guess>rand)
                System.out.println("Too Big. Think Smaller");

            attempt++;
            
        }while(guess != rand && attempt !=7);

        System.out.println("The correct number was: " + rand);
        
        if(rand != guess)
            System.out.println("😵 You LOSE! Better Luck Next Time");

        scanner.close();
    }
}
