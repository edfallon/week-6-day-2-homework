import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    private Library myLibrary;

    @Before
    public void before(){
        ArrayList<String> myBooks = new ArrayList<>();
        myBooks.add("Labyrinth");
        myBooks.add("The Lost Symbol");
        myBooks.add("New Moon");
        myBooks.add("Digital Fortress");

        myLibrary = new Library(myBooks, 100);
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(4, myLibrary.getBookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        myLibrary.addBook("Lord of the Flies");
        assertEquals(5, myLibrary.getBookCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(100, myLibrary.getCapacityCount());
    }

    @Test
    public void addBookToLibraryIsCapacityNotReached(){
        myLibrary.addBook("Lord of the Flies");
        assertEquals(5, myLibrary.getBookCount());
    }
}
