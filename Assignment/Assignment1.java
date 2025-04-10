package Assignment;
import java.util.Scanner;
public class Assignment1{
    public void display(){
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;  // Smallest possible value to start

        System.out.println("Enter 100 integers:");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum number entered is: " + max);

        scanner.close();
    }
}