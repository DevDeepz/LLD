package BankAccount;

public class BankAccount {
        private double balance;
         private String ownerName;
         //Constructor
    public BankAccount (String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Invalid withdrawal amount");
        }
        else if(amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else {
            balance -= amount;
        }
    }
    public void getBalance() {
        System.out.println("Balance amount" + balance);
    }
    public  void setBalance(double amount) {
        if (balance >= 0) {
            balance = amount;
            System.out.println("Balance updated successfully.");
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    public void getOwnerName() {
        System.out.println("Owner" + ownerName);
    }
    public void setOwnerName(String name) {
        ownerName = name;
        System.out.println("Owner name updated successfully.");
    }
}