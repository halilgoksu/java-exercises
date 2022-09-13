//Design and implement a class called Book that contains instance data for the title
//author, publisher, and copyright date.Define the Book constructor
//that accept and initialize this data.Include setters and getters for all instance data.
//Include a toString method that returns a nicely formatted,multi-line description of the book.
//Create a driver class called Bookshelf whose main method instantiates and updates several book objects


package OOP3;

public class BookMain {
    public static void main(String[] args) {
        Book book1,book2,book3;
        book1= new Book("Java book","Donk","Nava's Publishing","5/25/2019");
        book2= new Book("JS book","James","Kft","15/7/2021");
        book3= new Book("Css book","Halil","Pinash Publishing","5/25/2020");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }

}
