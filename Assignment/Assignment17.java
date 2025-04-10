package Assignment;

 class Calculator {

    // Method with one int parameter
    public int add(int a) {
        return a + 10;
    }

    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding the method
class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }
}

public class Assignment17{
    public void display() {
        Calculator calc = new Calculator();

        System.out.println("add(5): " + calc.add(5));
        System.out.println("add(5, 10): " + calc.add(5, 10));
        System.out.println("add(5, 10, 15): " + calc.add(5, 10, 15));

        
        Dog myDog = new Dog(); // Polymorphism

        myDog.makeSound();    // Calls Dog's overridden version
       
}
}