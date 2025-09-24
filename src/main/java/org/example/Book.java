package org.example;

public class Book {
    // Instance variables
    String title;
    String author;

    // Constructor to create a new Book object
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: \"" + this.title + "\", Author: " + this.author);
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book myBook = new Book("The Hobbit", "J.R.R. Tolkien");

        // Call the displayDetails method
        myBook.displayDetails();
    }
}
