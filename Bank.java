import java.util.Scanner;

public class Bank{
    private double balance;

    public Bank(){
        balance = 0;
    }

    public Bank(double balance){
        this.balance = balance;
    }

    public void showBalance(){
        System.out.println("------------------------------\nYour Current Balance is " + balance +
            "\n------------------------------");
    }

    public void deposit(Scanner scanner){
        double amount;

        System.out.print("Enter Deposit Amount: ");
        amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(Scanner scanner){
        double amount;

        System.out.print("Enter WithDraw Amount: ");
        amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Invalid or Insufficient Balance.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bank acc = new Bank(30000);
        int opt;

        do{
            System.out.println("*******************************");
            System.out.println("        BANKING PROGRAM        ");
            System.out.println("*******************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. WithDraw");
            System.out.println("4. Exit");
            System.out.println("*******************************");
            System.out.print("Enter Your Choice (1-4): ");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    acc.showBalance();
                    break;
                case 2:
                    acc.deposit(scanner);
                    break;
                case 3:
                    acc.withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Enter a Valid Choice (1-4)");
            }
        }while(opt!=4);            
        scanner.close();
    }
}