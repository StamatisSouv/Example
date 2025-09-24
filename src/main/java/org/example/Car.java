package org.example;

public class Car {

    // Instance variables (the state of the car)
    String make;
    String model;
    int year;
    boolean isEngineOn;

    // Constructor to initialize a new Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isEngineOn = false; // The engine is off when the car is created
    }

    // Method to start the engine
    public void startEngine() {
        if (isEngineOn) {
            System.out.println("The engine is already running.");
        } else {
            this.isEngineOn = true;
            System.out.println("Vroom! The engine starts.");
        }
    }

    // Method to display the car's information
    public void displayInfo() {
        System.out.println("Car: " + this.year + " " + this.make + " " + this.model);
    }

    // A main method to demonstrate the class
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car("Honda", "Civic", 2023);

        // Call the methods on the myCar object
        myCar.displayInfo(); // Output: Car: 2023 Honda Civic
        myCar.startEngine(); // Output: Vroom! The engine starts.
    }
}
