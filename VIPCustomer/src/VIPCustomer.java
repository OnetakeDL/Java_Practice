public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //no parameter, default constructor
    public VIPCustomer() {
        this("Default name", 0.0, "Default email");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default email");
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
