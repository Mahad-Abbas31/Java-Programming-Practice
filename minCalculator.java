import java.util.Scanner;                           // 

public class minCalculator {
    // int x;  // ___ 1st number
    // int y;  // ___ 2nd number

    // public minCalculator(){
    //     System.out.println("Default Constructor Invoked");
    //     x=0;
    //     y=0;
    // }
    
    // public minCalculator(int x, int y){
    //     System.out.println("Parameterized Constructor Invoked");
    //     this.x=x;
    //     this.y=y;
    // }

    // ____ Calculator Functions
    public float add(float x, float y){            return x+y;        }
    public float subtract(float x, float y){       return x-y;        }
    public float multiply(float x, float y){       return x*y;        }
    public float divide(float x, float y){         return x/y;        }

    public void compare(float x, float y){
        if(x>y)
            System.out.println(x + " is greater than " + y);
        else if(x==y)
            System.out.println(x + " is  equal to " + y);
        else
            System.out.println(x + " is  less than " + y);
    }

    public void displayFunctions(){
        Scanner scanner = new Scanner(System.in);       // ____ For INPUT (Scannner class object) 
        int choice;

        float a; float b;
        System.out.println("Enter Two Numbers to perform an Arithematic Calculation");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        
        do{
            System.out.println("---Calculator Functions---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Compare");
            System.out.println("6. EXIT");
            System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();                             // ____ For USER INPUT

            switch (choice) {
                case 1: System.out.println("Added " + a + " and " + b + ": " + add(a, b));
                    break;
            
                case 2: System.out.println("Subtracted " + b + " from " + a + ": " + subtract(a, b));
                    break;
            
                case 3: System.out.println("Multiplied " + a + " and " + b + ": " + multiply(a, b));
                    break;
            
                case 4: System.out.println("Divided " + a + " by " + b + ": " + divide(a, b));
                    break;
            
                case 5: compare(a, b);
                    break;
                            
                default: System.out.println("Your Entered a wrong Choice, Enter 1-6 for Correct choice to perform the Arithematic Operation");
                    break;
            }
        }while(choice!=6);
        scanner.close();
    }

    
}

