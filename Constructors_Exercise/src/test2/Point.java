package test2;

public class Point {
    private int x;
    private int y;

    public Point () {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //no parameter
    //this method will invoke the second distance()
    public double distance() {
        return distance(0,0);
    }

    //parameter: an accurate coordinate(x,y)
    public double distance(int x, int y) {
        return Math.sqrt((getX() - x) * (getX() - x)
                + (getY() - y) * (getY() - y));
    }

    //parameter: a Point object
    public double distance(Point point) {
        return Math.sqrt((getX() - point.x) * (getX() - point.x)
                + (getY() - point.y) * (getY() - point.y));
    }
}