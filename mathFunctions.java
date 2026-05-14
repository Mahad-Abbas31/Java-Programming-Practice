import java.util.Scanner;
public class mathFunctions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a, b, c;          // ____ Dimensions of a Triangle

        System.out.println("=======Hypotenuse of a Triangle=======");
        System.out.print("Enter the Height of a Triangle (a): ");
        a = scanner.nextDouble();

        System.out.print("Enter the Base of a Triangle (b): ");
        b = scanner.nextDouble();
        
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("Hypotenuse (c): " + c);

        scanner.close();
    }
}
