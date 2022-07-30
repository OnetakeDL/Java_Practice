public class HealthyBurger extends Hamburger{
    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll",
                "Soy-based meat", 10);
    }

    @Override
    public void printMenu() {
        super.printMenu();
        System.out.println("5. Chicken Breast  ||  Price: $2.5");
        System.out.println("6. Caesar Salad	   ||  Price: $1.0");
    }

    @Override
    public void addAdditional(int choice) {
        super.addAdditional(choice);
        switch (choice) {
            case 5:
                double chickenBreastPrice = 4.0;
                this.setAdditionalPrice(getAdditionalPrice() +
                        chickenBreastPrice);
                System.out.println("\nAdded: Chicken Breast");
                break;
            case 6:
                double caesarSaladPrice = 5.0;
                this.setAdditionalPrice(getAdditionalPrice() +
                        caesarSaladPrice);
                System.out.println("\nAdded: Caesar Salad");
                break;
        }
    }

    @Override
    public void checkOrder() {
        super.checkOrder();
    }
}
