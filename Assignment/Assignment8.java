package Assignment;
import java.util.Scanner;
public class Assignment8 {
    public void display(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary representation of " + decimal + " is: " + binary);

        scanner.close();
    }
}
