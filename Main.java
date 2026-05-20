import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner fin = new Scanner(new File("curtains.txt"));

        int count;
        int id;
        double price;
        String color, type;

        // _____ Asking for No. of Data Inputs from User 
        System.out.print("Enter the No. of Records You want to ADD: ");
        count = sc.nextInt();

        // _____ Initializing and Making the Array
        Curtain[] arr = new Curtain[count];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Curtain();
        }
        
        // _____ Taking Data from User Input
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter ID for Record " + i + ": ");
            id = sc.nextInt();
            arr[i].setId(id);            
            sc.nextLine();

            System.out.print("Enter Price for Record " + i + ": ");
            price = sc.nextDouble();
            arr[i].setPrice(price);
            sc.nextLine();
            
            System.out.print("Enter Type for Record " + i + ": ");
            type = sc.nextLine();
            arr[i].setType(type);
            
            System.out.print("Enter Color for Record " + i + ": ");
            color = sc.nextLine();
            arr[i].setColor(color);
        }

        // _____ Saving Data to File
        for(int i = 0; i < arr.length; i++){
            try{
                arr[i].addToFile();
            }
            catch(Exception e){
                System.out.println("File Error!");
            }
        }

        // _____ Counting File Data
        int fileCount = 0;
        while(fin.hasNextLine()){
            fin.nextLine();
            fileCount++;
        }

        Curtain[] arr2 = new Curtain[fileCount];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = new Curtain();
        }

        fin.close();


        fin = new Scanner(new File("curtains.txt"));
        fin.useDelimiter(",|\n");

        for(int i = 0; i < arr2.length; i++){
            id = fin.nextInt();
            price = fin.nextDouble();
            type = fin.next();
            color = fin.next();

            arr2[i].setId(id);            
            arr2[i].setPrice(price);
            arr2[i].setType(type);
            arr2[i].setColor(color);
        }

        for(int i = 0; i < arr2.length; i++){
            arr2[i].display();
        }

        fin.close();
        sc.close();   
    }
    
}
