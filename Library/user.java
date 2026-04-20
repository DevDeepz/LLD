package Library;

abstract class user {
    private static int idCounter = 0;
    private static int totaluser = 0;
    private final String userID;
    private String name;
    private String contactInfo;
    //Default constructor
    public user() {
        this.userID = generateUniqueId();
        totaluser++;
    }

    //parameterised constructor
    public user(String name, String contactInfo) {
        this.userID = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totaluser++;
    }

    //copy constructor
    public user (user other) {
        this.userID = other.userID;;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totaluser++;
    }
    //Getters
    public String getName() {
        return name;
    }
    public String getContactInfo() {
        return contactInfo;
    }

    //Setters
    public void setName(String newName) {
        this.name = newName;
    }
    public void setContactInfo(String info) {
        this.contactInfo = info;
    }
    public final static String generateUniqueId() {
        return String.valueOf(++idCounter);
    }

    //Abstract method
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
