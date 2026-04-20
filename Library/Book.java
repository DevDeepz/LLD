package Library;

abstract class Book implements Lendable{
     String isbn;
     String title;
     String author;
    private boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public Book (Book other) {
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    @Override
    public boolean lend(user user) {
        if(isAvailable && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return true;
    }

    @Override
    public void returnBook(user user) {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
