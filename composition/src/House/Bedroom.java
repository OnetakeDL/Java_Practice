package House;

public class Bedroom {
    private String name;
    private Wall wall_1;
    private Wall wall_2;
    private Wall wall_3;
    private Wall wall_4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall_1, Wall wall_2, Wall wall_3,
                   Wall wall_4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall_1 = wall_1;
        this.wall_2 = wall_2;
        this.wall_3 = wall_3;
        this.wall_4 = wall_4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Wall getWall_1() {
        return wall_1;
    }

    public Wall getWall_2() {
        return wall_2;
    }

    public Wall getWall_3() {
        return wall_3;
    }

    public Wall getWall_4() {
        return wall_4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("\nBedroom -> Making bed");
        bed.make();
    }
}
