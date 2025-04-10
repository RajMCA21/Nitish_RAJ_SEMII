package Assignment;

public class Assignment10 {
    public void display(){
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Using do-while loop
        System.out.println("\nUsing do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // Using for loop
        System.out.println("\nUsing for loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }
    }
}
