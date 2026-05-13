public class alignments {
    public static void main(String[] args){
        String name = "Mahad Abbas";
        int id = 2501366;
        boolean isStudying = true;
        double merit = 93.15;
        char grade = 'A';

        System.out.printf("Name: %s\n", name);
        System.out.printf("ID: %d\n", id);
        System.out.printf("Is Studying: %b\n", isStudying);
        System.out.printf("Merit: %f\n", merit);
        System.out.printf("Grade: %c\n", grade);

        double p1 = 9.99;
        double p2 = 10.09;
        double p3 = -103.21;
        double p4 = 1451.423;

        System.out.println("======================================\n");

        System.out.printf("Price 1: %+.4f\n", p1);
        System.out.printf("Price 2: %+.1f\n", p2);
        System.out.printf("Price 3: %+.1f\n", p3);
        System.out.printf("Price 4: %+,.1f\n", p4);

        System.out.println("======================================\n");

        System.out.printf("%10f\n", p1);
        System.out.printf("%10f\n", p2);
        System.out.printf("%10f\n", p3);
        System.out.printf("%10f\n", p4);

        System.out.println("======================================\n");

        // %s  -> String
        // %d  -> Integer
        // %f  -> Floating point number (float/double)
        // %c  -> Character
        // %b  -> Boolean
        // %n  -> New line
        // %%  -> Print % sign

        // %.2f   -> 2 decimal places
        // %.3f   -> 3 decimal places

        // %10s   -> Right align with width 10
        // %-10s  -> Left align with width 10

        // %05d   -> Pad integer with zeros
        // %010d  -> Width 10 with zero padding

        // %10.2f -> Width 10 and 2 decimal places
        // %-10.2f -> Left align float with 2 decimal places

        // %+d    -> Show sign (+/-)
        // %,d    -> Comma separated integer
        // %e     -> Scientific notation
        // %x     -> Hexadecimal
        // %o     -> Octal

        // Example:
        // System.out.printf("%-10s %10.2f%n", "Mahad", 93.15);
    }
}
