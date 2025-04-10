package Assignment;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class Assignment12 {
    public void display(){
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Specific to Dog

        System.out.println();

        // Object of Cat
        Cat cat = new Cat();
        cat.eat();   // Inherited from Animal
        cat.meow();  // Specific to Cat
    }
    
}
