import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double A;
        double P;
        double r;
        double n;
        double t;

        System.out.println("The initial amount of money you start with: ");
        P = scanner.nextDouble();

        System.out.println("The annual interest rate (e.g. 0.05 for 5%): ");
        r = scanner.nextDouble();

        System.out.println("The number of times that interest is compounded in a single year: ");
        n = scanner.nextDouble();

        System.out.println("The total time the money is invested or borrowed for, measured in years: ");
        t = scanner.nextDouble();

        A = P* ( Math.pow(( 1+(r/n) ),(n*t)) );
        System.out.println("Total amount of money you will have after the given time: " + A);

        scanner.close();
    }
}