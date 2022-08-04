package House;

public class Main {
    public static void main(String[] args) {
        Wall wall_1 = new Wall("East");
        Wall wall_2 = new Wall("South");
        Wall wall_3 = new Wall("West");
        Wall wall_4 = new Wall("North");

        Ceiling ceiling = new Ceiling(3, 55);

        Bed bed = new Bed("Modern", 2, 2.0, 1.6, 1, 1);

        Lamp lamp = new Lamp("Classic", false, 5000);

        Bedroom bedroom = new Bedroom("DL's bedroom", wall_1, wall_2,
                wall_3, wall_4, ceiling, bed, lamp);

        bedroom.getLamp().turnOn();

        System.out.println("\nWall direction: " + bedroom.getWall_3().getDirection());
        bedroom.getWall_3().openWindow();
        System.out.println("\nWall direction: " + bedroom.getWall_4().getDirection());
        bedroom.getWall_4().openWindow();

        bedroom.makeBed();
    }
}
