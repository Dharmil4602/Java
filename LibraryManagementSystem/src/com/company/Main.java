package com.company;

class Library
{
    String[] books;
    int no_of_books;

    // Below one is the constructor
Library()
{

this.books = new String[100];
this.no_of_books = 0;
}

// Adds the book
void addBook(String book)
{
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println(book + " Book Has Been Added");
}

// Shows the available books
void showAvailableBook()
{
    int n = 100;
    System.out.println(" ");
    System.out.println("Available Books Are: ");
    for (String book: this.books)
    {
        if (book == null)
        {
            continue; // By continuing here the below function issueBook will be removing the book we issued from the array
        }
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i + ". " + book);
            break;
        }

    }
}

// Issuing A Book
void issueBook(String book)
{
    System.out.println(" ");
        for (int i = 0; i <= this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println( book + " Book Has Been Issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book Does Not Exist");
}

// Returning A Issued Book
    void returnBook(String book)
    {
        System.out.println(" ");
//        this.books[no_of_books] = book;
        addBook(book);
        System.out.println( book + " Book Has Been Returned");
    }


}
public class Main {

    public static void main(String[] args) {
	// write your code here

        Library onlineLibrary = new Library();
        onlineLibrary.addBook("The Best Nightmare");
        onlineLibrary.addBook("The Worst Experience");
        onlineLibrary.addBook("C++");
        onlineLibrary.addBook("Algorithms");
        onlineLibrary.showAvailableBook();
        onlineLibrary.issueBook("C++");
        onlineLibrary.showAvailableBook();
        onlineLibrary.returnBook("C++");
        onlineLibrary.showAvailableBook();

    }
}
