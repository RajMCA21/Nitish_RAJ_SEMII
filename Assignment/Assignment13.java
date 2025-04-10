package Assignment;


public class Assignment13 {
    // Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implement abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}
    public void display(){
    Dog d1=new Dog();
    d1.makeSound();
    d1.sleep();
    }
}
