package Assignment;
import java.util.Scanner;
public class Assignment7 {
    public void display(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit to find perfect numbers: ");
        int limit = scanner.nextInt();

        System.out.println("Perfect numbers up to " + limit + " are:");

        for (int number = 1; number <= limit; number++) {
            int sum = 0;

            // Find divisors and add them
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            // Check if sum of divisors equals the number
            if (sum == number) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
