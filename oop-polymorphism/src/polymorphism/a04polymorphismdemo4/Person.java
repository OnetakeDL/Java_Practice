package polymorphism.a04polymorphismdemo4;

//Person独立于继承体系，是单独的一个类
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //饲养狗
//    public void feedPet(Dog dog, String food) {
//        System.out.println(age + " year-old " + name + " keeps a "
//                + dog.getColor() + " color " + dog.getAge() + " years old dog.");
//        dog.eat(food);
//    }
//
//    //饲养猫
//    public void feedPet(Cat cat, String food) {
//        System.out.println(age + " year-old " + name + " keeps a "
//                + cat.getColor() + " color " + cat.getAge() + " years old cat.");
//        cat.eat(food);
//    }

    //希望有一个方法，能接收所有的动物对象
    //方法的形参可以写这些动物对象的父类Animal
    public void feedPet(Animal animal, String food) {
        if (animal instanceof Dog dog) {
            System.out.println(age + " year-old " + name + " keeps a "
                    + dog.getColor() + " color " + dog.getAge() + " years old dog.");
            dog.eat(food);
        } else if (animal instanceof Cat cat) {
            System.out.println(age + " year-old " + name + " keeps a "
                    + cat.getColor() + " color " + cat.getAge() + " years old cat.");
            cat.eat(food);
        } else {
            System.out.println("There is no such an animal!");
        }
    }
}
