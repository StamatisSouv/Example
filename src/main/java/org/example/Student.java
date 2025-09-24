package org.example;

public class Student {
    // Instance variables
    String name;
    int studentId;

    // Constructor to create a new Student object
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Method for the student to introduce themselves
    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and my ID is " + this.studentId + ".");
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student newStudent = new Student("Alice", 12345);

        // Call the introduce method
        newStudent.introduce();
    }
}
