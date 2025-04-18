package Assignment;
import java.util.Scanner;
public class Assignment11 {
    public void display(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits); // Raise digit to the power of number of digits
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
