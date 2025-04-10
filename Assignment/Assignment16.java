package Assignment;

public class Assignment16{
    public void display(){
        int n = 20; // Number of Fibonacci numbers to print

        int first = 0, second = 1;

        System.out.print("Fibonacci series (" + n + " terms):\n");

        for (int i = 0; i < n; i++) {
            System.out.print(first);

            if (i < n - 1) {
                System.out.print(", ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
    }
}