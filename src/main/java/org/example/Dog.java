package org.example;

public class Dog {

    // Instance variables (attributes of a Dog)
    String name;
    int age;

    // Constructor to create a new Dog object
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method (behavior of a Dog)
    public void bark() {
        System.out.println("Woof! My name is " + this.name + ".");
    }

    // A main method to run the example
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 5);

        // Call the bark method on the myDog object
        myDog.bark(); // Output: Woof! My name is Buddy.
    }
}
