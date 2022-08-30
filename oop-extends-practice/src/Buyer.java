public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name, "Buying");
    }

    @Override
    public void work() {
        System.out.println("The buyer is buying things...");
    }
}
