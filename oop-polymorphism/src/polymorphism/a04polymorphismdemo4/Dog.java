package polymorphism.a04polymorphismdemo4;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println("The " + getAge() + " years old " + getColor()
                + " dog is eating " + food + "...");
    }

    public void watchHouse() {
        System.out.println("The dog is watching house...");
    }
}
