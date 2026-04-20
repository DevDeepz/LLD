package Library;

public class Librarian extends user{
    private String employeeNumber;

    //Contructor
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name,contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("employeeNumber: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book Book) {
        //Implementations for adding book;
    }
    public void removeBook(Book Book) {
        //Implementations for removing book;
    }

}
