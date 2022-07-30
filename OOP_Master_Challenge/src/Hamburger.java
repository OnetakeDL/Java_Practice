public class Hamburger {
    private String burgerName;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double additionalPrice;

    public Hamburger(String burgerName, String breadRollType,
                     String meat, double Price) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = Price;
    }

    public void printMenu() {
        System.out.println("======== BILLS BURGER MENU ========");
        System.out.println("Please choose your additions.");
        System.out.println("1. Lettuce 	       ||  Price: $2.0");
        System.out.println("2. Tomato  	       ||  Price: $1.5");
        System.out.println("3. Cheese  	       ||  Price: $2.5");
        System.out.println("4. Cucumber	       ||  Price: $1.0");
    }

    public void addAdditional(int choice) {
        if (choice > 0 && choice < 5) {
            switch (choice) {
                case 1:
                    double lettucePrice = 2.0;
                    this.setAdditionalPrice(getAdditionalPrice() + lettucePrice);
                    System.out.println("\nAdded: Lettuce");
                    break;
                case 2:
                    double tomatoPrice = 1.5;
                    this.setAdditionalPrice(getAdditionalPrice() + tomatoPrice);
                    System.out.println("\nAdded: Tomato");
                    break;
                case 3:
                    double cheesePrice = 2.5;
                    this.setAdditionalPrice(getAdditionalPrice() + cheesePrice);
                    System.out.println("\nAdded: Cheese");
                    break;
                case 4:
                    double cucumberPrice = 1.0;
                    this.setAdditionalPrice(getAdditionalPrice() + cucumberPrice);
                    System.out.println("\nAdded: Cucumber");
                    break;
            }
        }
    }

    public void checkOrder() {
        System.out.println("\n==================== CHECK OUT ORDER " +
                "====================");
        System.out.println("Burger Type: " + getBurgerName() +
                " $" + getBasePrice());
        System.out.println("Additions: $" + getAdditionalPrice());
        System.out.println("Total: $" + getTotalPrice() + "\n");
    }

    public String getBurgerName() {
        return burgerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public double getTotalPrice() {
        return getBasePrice() + getAdditionalPrice();
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }
}
