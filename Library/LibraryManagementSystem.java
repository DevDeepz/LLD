package Library;
import java.util.*;

public class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<user> registeredUsers;

    //Constructors
    public LibraryManagementSystem() {
        this.bookInventory = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public List<Book> bookInventory() {
        return bookInventory;
    }

    public List<user> getRegisteredUsers() {
        return registeredUsers;
    }
}
