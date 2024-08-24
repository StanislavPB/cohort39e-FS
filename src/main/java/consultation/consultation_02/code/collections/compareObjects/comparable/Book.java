package code.collections.compareObjects.comparable;

public class Book implements Comparable<Book>{

    private int id;
    private String bookName;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book anotherBook) {
        int compareResult = this.id - anotherBook.getId();

        if (compareResult == 0) {
            compareResult = bookName.compareTo(anotherBook.getBookName());
        }

        return compareResult;
    }


//    @Override
//    public int compareTo(Book anotherBook) {
//
//        int compareResult = bookName.compareTo(anotherBook.getBookName());
//
//        if (compareResult == 0) {
//            compareResult = this.id - anotherBook.getId();
//        }
//
//        return compareResult;
//    }
}
