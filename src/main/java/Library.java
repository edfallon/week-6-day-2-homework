import java.util.ArrayList;

public class Library {

    private ArrayList<String> books;
    private int capacity;

    public Library(ArrayList<String> booksPassedIn, Integer capacity){
        this.books = booksPassedIn;
        this.capacity = capacity;
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(String bookToAdd) {
        if (this.books.size() < this.capacity){
            this.books.add(bookToAdd);
        }
    }

    public int getCapacityCount() {
        return this.capacity;
    }


}
