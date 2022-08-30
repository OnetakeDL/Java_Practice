public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name, "Guiding");
    }

    @Override
    public void work() {
        System.out.println("The tutor is helping students...");
    }
}
