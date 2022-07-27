package test3;

public class Carpet {
    private double unitPrice;

    public Carpet(double unitPrice) {
        this.unitPrice = unitPrice < 0 ? 0 : unitPrice;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }
}
