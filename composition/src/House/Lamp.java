package House;

public class Lamp {
    private String style;
    private boolean batteryPowered;
    private int hue;

    public Lamp(String style, boolean batteryPowered, int hue) {
        this.style = style;
        this.batteryPowered = batteryPowered;
        this.hue = hue;
    }

    public void turnOn() {
        System.out.println("\nLamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public int getHue() {
        return hue;
    }
}
