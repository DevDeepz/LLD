package Library;

public interface Lendable {
    boolean lend(user user);
    void returnBook(user user);
    boolean isAvailable();

}
