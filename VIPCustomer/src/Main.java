public class Main {
    public static void main(String[] args) {
        VIPCustomer DL = new VIPCustomer();
        //this will print [Default name]
        System.out.println(DL.getName());
        System.out.println("DL's credit limit: " + DL.getCreditLimit());
        System.out.println("DL's email address: " +DL.getEmailAddress() + "\n");

        VIPCustomer DL2 = new VIPCustomer("DL2", 1000.0);
        System.out.println(DL2.getName());
        System.out.println("DL2's credit limit: " + DL2.getCreditLimit());
        System.out.println("DL2's email address: " +DL2.getEmailAddress() + "\n");

        VIPCustomer DL3 = new VIPCustomer("DL3", 2000.0,
                "123456789@qq.com");
        System.out.println(DL3.getName());
        System.out.println("DL3's credit limit: " + DL3.getCreditLimit());
        System.out.println("DL3's email address: " +DL3.getEmailAddress() + "\n");
    }
}
