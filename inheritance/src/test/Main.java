package test;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1,
                1, 5, 5);
        animal.move(15);
        animal.eat();

        System.out.println();

        Dog dog = new Dog("Yorkie", 8, 20,
                2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
