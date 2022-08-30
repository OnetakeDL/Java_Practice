public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name, "Teaching");
    }

    @Override
    public void work() {
        System.out.println("The lecturer is giving a lecture...");
    }
}
