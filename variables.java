public class variables {
    public static void main(String[] var0){
        byte quiz = 10;                     // ___ 1 byte
        short students = 50;                // ___ 2 byte
        int id = 2501366;                   // ___ 4 byte
        long CNIC = 10000000001L;           // ___ 8 byte
        String name = "Mahad Abbas";
        float gpa = 3.59f;                  // ___ 4 byte
        double marks = 40.6d;               // ___ 8 byte
        char grade = 'A';                   // ___ 2 byte
        boolean topper = true;              // ___ 1 bit
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Topper: " + topper);
        System.out.println("Quiz: " + quiz);
        System.out.println("Marks: " + marks);
        System.out.println("Students: " + students);
        System.out.println("CNIC: " + CNIC);   
    }
}
