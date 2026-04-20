package Library;

public class Member extends user{
    private int borrowedBookCount;
    private final int MAX_BORROW_LIMIT = 5;

    //Constructor
    public Member() {
        super();
        this.borrowedBookCount = 0;
    }
    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBookCount = 0;
    }

    @Override
    public void displayDashboard() {
    System.out.println("Member Dashboard");
    System.out.println("Books Borrowed: " + borrowedBookCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBookCount < MAX_BORROW_LIMIT;
    }
}
