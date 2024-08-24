package code.collections.compareObjects.comparable;

import java.util.Set;
import java.util.TreeSet;

public class BookLibrary {
    public static void main(String[] args) {

        Set<Book> library = new TreeSet<>();

        library.add(new Book(10,"Book2"));
        library.add(new Book(2,"Book2"));
        library.add(new Book(1,"Book4"));
        library.add(new Book(7,"Book17"));
        library.add(new Book(5,"Book5"));
        library.add(new Book(1,"Book1"));
        library.add(new Book(12,"Book12"));
        library.add(new Book(7,"Book7"));
        library.add(new Book(11,"Book11"));

        for (Book book : library){
            System.out.println("id = " + book.getId() + "    Book name = " + book.getBookName());
        }

    }
}
