import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to Weight Conversion");
        do {
            System.out.println("\nEnter Your Choice for the Conversion: ");
            System.out.println("1. kgs to lbs");
            System.out.println("2. lbs to kgs");
            System.out.println("0. EXIT");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Weight in kgs: ");
                weight = scanner.nextDouble();

                newWeight = weight * 2.20462;
                System.out.println(weight + " kgs = " + newWeight + " lbs");
            }
            else if (choice == 2) {
                System.out.print("Enter Weight in lbs: ");
                weight = scanner.nextDouble();

                newWeight = weight * 0.453592;
                System.out.println(weight + " lbs = " + newWeight + " kgs");
            }
            else if (choice == 0) {
                System.out.println("Program Exited");
            }
            else {
                System.out.println("INVALID Choice, Please Choose Correct Option");
            }

        } while (choice != 0);

        scanner.close();
    }
}