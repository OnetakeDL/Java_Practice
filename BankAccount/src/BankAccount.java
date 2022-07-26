public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //no parameter, default constructor
    public BankAccount() {
        this("12345", 50.0,
                "Unknown", "default email", "default phoneNumber");
        System.out.println("Empty constructor is called");
    }

    public BankAccount(String accountNumber, double balance,
                       String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        if (depositAmount >= 0) {
            this.balance += depositAmount;
            System.out.println("\nDeposit of " + depositAmount + " made.");
            System.out.println("New balance is now: " + this.balance + "\n");
        }
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("You tried to withdraw " + withdrawAmount);
            System.out.println("Only " + this.balance + " available. \nWithdraw not processed");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " processed.");
            System.out.println("Remaining balance is now: " + this.balance);
        }
    }
}
