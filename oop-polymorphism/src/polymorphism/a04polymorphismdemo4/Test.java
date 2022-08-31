package polymorphism.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法
        /*Person p1 = new Person("DL", 21);
        Dog dog = new Dog(2, "white");
        p1.feedPet(dog, "dog food");

        Person p2 = new Person("Zeng", 20);
        Cat cat = new Cat(3, "grey");
        p2.feedPet(cat, "cat food");
        */

        Person Nick = new Person("Nick", 25);
        Dog dog1 = new Dog(2, "yellow");
        Cat cat1 = new Cat(2, "silver");
        Nick.feedPet(dog1, "bone");
        dog1.watchHouse();
        Nick.feedPet(cat1, "dried fish");
        cat1.catchMouse();
    }
}
