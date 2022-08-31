package polymorphism.a04polymorphismdemo4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println("The " + getAge() + " years old " + getColor()
                + " kitty is eating " + food + "...");
    }

    public void catchMouse() {
        System.out.println("The cat is catching mouse...");
    }
}
