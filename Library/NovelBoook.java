package Library;

public abstract class NovelBoook extends Book{
    private String genre;

    public NovelBoook(String isbn, String title, String author, String genre) {
        super(isbn,title,author);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("NovelBook - ISBN: " + isbn + ", Title: " + title + ", Author: " + author + ", Genre: " + genre);
    }
}
