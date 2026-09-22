import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        boolean isEnrolled;
        double gpa;
        int[] marks = new int[3];


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
         name = sc.nextLine();
        System.out.println("Enter the age: ");
         age = sc.nextInt();
        System.out.println("Enter if enrolled: ");
         isEnrolled = sc.nextBoolean();
        System.out.println("Enter the GPA: ");
         gpa = sc.nextDouble();
        
        System.out.println("Enter the marks: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            System.out.println(marks[i]);
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
       System.out.println("Is Enrolled: " + isEnrolled);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total: " + calculateTotal(marks));
        System.out.println("Average: " + calculateAverage(marks));
 }
 static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    static double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);
        return (double) total / marks.length;
    }
    
}
