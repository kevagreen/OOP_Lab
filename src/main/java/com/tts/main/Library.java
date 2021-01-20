package com.tts.main;
import java.util.ArrayList;
import java.util.List;

public class Library{
    // Add the missing implementation to this class
    String officeHours = "9 to 5 daily";
    String address;
    String title;
    private static List<Book> books;
    private static boolean borrowed = false;

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");


        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));


        // Print opening hours and the addresses
        System.out.println("Library hours:");
        firstLibrary.printOpeningHours();


        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        //firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
    public void addBook(Book bookTitle){
        books.add(bookTitle);
    }

    public static void borrowBook(String borrowedBook){
    boolean checkedIn = false;
    for(Book book:books){
        if(book.getTitle() == borrowedBook){
            checkedIn = true;
            if(!book.isBorrowed()) {
                System.out.println(book.getTitle() + " available for checkout");
                book.borrowed();
            }else {
                System.out.println(book.getTitle() + " is checked out");
            }
    }
    }
    }
    public static void printAvailableBooks(){
        for(Book book:books){
            System.out.println(book);
        }
    }
    public Library(String address){
        this.address = address;
        books = new ArrayList<Book>();
    }
    public void printOpeningHours(){
        System.out.println(officeHours);
    }
    public void printAddress(){
        System.out.println(" Address " + this.address);
    }
}