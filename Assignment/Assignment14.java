package Assignment;

public class Assignment14{
    public void display(){
        int[] numbers = {10, 20, 30, 40, 50};

        // Display the contents of the array
        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Display the length of the array
        System.out.println("Length of the array: " + numbers.length);
    }
}