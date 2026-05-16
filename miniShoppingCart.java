import java.util.Scanner;
public class miniShoppingCart {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String item;
        float price;
        int quantity;

        System.out.print("What items would you like to buy: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each: ");
        price = scanner.nextFloat();
        System.out.print("How many " + item + " would you like to buy: ");
        quantity = scanner.nextInt();

        System.out.println("-----------------------------------");
        System.out.println("You have bought " + quantity + " " + item + "(s)");
        System.out.println("Your Total is $" + quantity*price);

        scanner.close();
    }
}
