// ___ MAD LIBS GAME ___
import java.util.Scanner;
public class madLibs {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String adj1;
        String name1;
        String num1;
        String relative1;
        String place1;
        String place2;
        String verb;
        String noun1;
        String adj2;
        String adj3;
        String name2;
        String adj4;

        System.out.print("Enter an Adjective: ");
        adj1= scanner.nextLine();
        System.out.print("Enter a Name: ");
        name1= scanner.nextLine();
        System.out.print("Enter a Number: ");
        num1= scanner.nextLine();
        System.out.print("Enter a Relative Name: ");
        relative1= scanner.nextLine();
        System.out.print("Enter a Place: ");
        place1= scanner.nextLine();
        System.out.print("Enter a Place: ");
        place2= scanner.nextLine();
        System.out.print("Enter a Verb: ");
        verb= scanner.nextLine();
        System.out.print("Enter a Noun: ");
        noun1= scanner.nextLine();
        System.out.print("Enter an Adjective: ");
        adj2= scanner.nextLine();
        System.out.print("Enter an Adjective: ");
        adj3= scanner.nextLine();
        System.out.print("Enter a Name: ");
        name2= scanner.nextLine();
        System.out.print("Enter a Adjective: ");
        adj4= scanner.nextLine();
        
        System.out.println("A new and " + adj1 + " fairy princess movie is coming out soon!");
        System.out.println("It will be about Snow " + name1 + " and the " + num1 + " dwarfs");
        System.out.println("Snow " + name1 + " is a beauty whose beauty threatens her " + relative1 + ", the queen");
        System.out.println("Snow " + name1 + " is forced to flee from palace from " + place1 + " and hides in nearby " + place2);
        System.out.println("There she discovers the dwarfs " + verb + " in their " + noun1);
        System.out.println("But the Queen finds her and casts a " + adj2 + " spell on her");
        System.out.println("The dwarfs take well care of her untill the " + adj3 + " " + name2 + " comes to rescue her and they all live " + adj4 + " ever after!");

        scanner.close();
    }
}