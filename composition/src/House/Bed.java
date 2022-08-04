package House;

public class Bed {
    private String style;
    private int pillows;
    private double length;
    private double width;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, double length, double width, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.length = length;
        this.width = width;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
