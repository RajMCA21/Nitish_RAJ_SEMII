package Assignment;
import java.util.Scanner;
public class Assignment4{
    public void display(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int originalNumber = number;

        number = Math.abs(number); // Handle negative numbers

        while (number != 0) {
            sum += number % 10; // Add the last digit
            number /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}