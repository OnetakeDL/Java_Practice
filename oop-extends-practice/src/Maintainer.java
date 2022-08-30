public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name, "Maintaining");
    }

    @Override
    public void work() {
        System.out.println("The maintainer is fixing stuffs...");
    }
}
