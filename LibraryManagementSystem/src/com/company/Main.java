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

void addBook(String book)
{
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println(book + " Book Has Been Added");
}


void showAvailableBook()
{
    int n = 100;
    System.out.println(" ");
    System.out.println("Available Books Are: ");
    for (String book: this.books)
    {
        if (book == null)
        {
            break;
        }
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i + ". " + book);
            break;
        }

    }
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

    }
}
