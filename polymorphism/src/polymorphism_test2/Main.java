package polymorphism_test2;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        System.out.println("\n" + getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Accord extends Car {
    public Accord(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Accord -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Accord -> accelerate()";
    }

    @Override
    public String brake() {
        return "Accord -> brake()";
    }
}

class Camry extends Car {
    public Camry(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println("Type: " + car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Accord accord = new Accord("260TURBO", 4);
        System.out.println("Type: " + accord.getName());
        System.out.println(accord.startEngine());
        System.out.println(accord.accelerate());
        System.out.println(accord.brake());

        Camry camry = new Camry("2.0GVP", 4);
        System.out.println("Type: " + camry.getName());
        System.out.println(camry.startEngine());
        System.out.println(camry.accelerate());
        System.out.println(camry.brake());

        Honda honda = new Honda("240TURBO", 4);
        System.out.println("Type: " + honda.getName());
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());
    }
}
