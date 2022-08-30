public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("The admin staff is working...");
    }
}
