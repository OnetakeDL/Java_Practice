public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Beyond Burger", meat, price,
                "Honey wheat Bread");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        if (healthyExtra1Name == null) {
            System.out.println("One order of Beyond Burger on" +
                    " Honey wheat Bread with " + healthyExtra2Name);
        } else if (healthyExtra2Name == null) {
            System.out.println("One order of Beyond Burger on" +
                    " Honey wheat Bread with " + healthyExtra1Name);
        } else {
            System.out.println("One order of Beyond Burger on" +
                    " Honey wheat Bread with " + healthyExtra1Name
                    + " and " + healthyExtra2Name);
        }
        return super.itemizeHamburger() + healthyExtra1Price
                + healthyExtra2Price;
    }
}
