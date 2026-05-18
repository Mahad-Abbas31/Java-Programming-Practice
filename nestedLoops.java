import java.util.Scanner;
public class nestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        String sym;

        System.out.print("Enter No. of Rows: ");
        row = scanner.nextInt();

        System.out.print("Enter No. of Columns: ");
        column = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Symbol you want to print: ");
        sym = scanner.nextLine();

        for(int i=0; i<row; i++){
            for(int j = 0; j<column; j++){
                System.out.print(sym);
            }
            System.out.println();            
        }

        scanner.close();
    }
}
