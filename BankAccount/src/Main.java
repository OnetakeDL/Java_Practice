public class Main {
    public static void main(String[] args) {
        BankAccount DLAccount = new BankAccount("ONETAKEDL", 1000.0,
                "DL", "123456789@qq.com", "13312345678");
        System.out.println("Name: " + DLAccount.getCustomerName());
        System.out.println("Balance: " + DLAccount.getBalance() + "\n");

        DLAccount.withdraw(100.0);

        DLAccount.deposit(50.0);
        DLAccount.withdraw(1000.0);

        DLAccount.deposit(51.0);
        DLAccount.withdraw(1000.0);
    }
}
