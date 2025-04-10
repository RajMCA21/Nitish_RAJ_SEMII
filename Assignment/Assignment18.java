package Assignment;
import java.util.Scanner;
public class Assignment18{
     class Student {
        String name;
        int rollNo;
        int[] marks = new int[5];
    

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to calculate average and assign stream
    public void assignStream() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }

        double average = total / 5.0;
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Average Marks: " + average + "%");

        System.out.print("Assigned Stream: ");
        if (average >= 90) {
            System.out.println("Science with Computer Science");
        } else if (average >= 75) {
            System.out.println("Science");
        } else if (average >= 60) {
            System.out.println("Commerce");
        } else if (average >= 40) {
            System.out.println("Arts");
        } else {
            System.out.println("Fail");
        }
    }
}
    public void display(){
        Student s = new Student();
        s.inputDetails();
        s.assignStream();
    }
}