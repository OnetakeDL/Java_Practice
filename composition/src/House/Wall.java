package House;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void openWindow() {
        System.out.println("Wall -> Opening window");
    }
}
