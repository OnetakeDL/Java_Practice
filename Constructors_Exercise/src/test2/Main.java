package test2;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("Distance: First point to origin(0,0) = "
                + first.distance());

        System.out.println("Distance: First point to (2,2) = "
                + first.distance(2, 2));

        System.out.println("Distance: First point to second point = "
                + first.distance(second));

        System.out.println("\nCreate a Point object without parameter.");
        Point point = new Point();
        //this point.distance() will set point's(x,y) to (0,0)
        System.out.println("Distance: " + point.distance());
    }
}
