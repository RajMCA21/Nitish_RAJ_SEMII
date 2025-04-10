package Assignment;
import java.util.Scanner;
public class Assignment15{
    public void display(){
        Scanner scanner = new Scanner(System.in);

        // Accept input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int capitalCount = 0;
        int smallCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                capitalCount++;
            } else if (Character.isLowerCase(ch)) {
                smallCount++;
            }
        }

        // Display results
        System.out.println("Total capital letters: " + capitalCount);
        System.out.println("Total small letters: " + smallCount);
    }
}