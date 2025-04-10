package Assignment;

class Student {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Assignment9 {
    public void display(){
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Display student information
        System.out.println("Student 1 Details:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Details:");
        student2.displayInfo();
    }
    }

