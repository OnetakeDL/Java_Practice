public class Tesla extends Car {
    private int roadServiceMonths;

    public Tesla(int roadServiceMonths) {
        super("Tesla", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (rate > 0) {
            System.out.println("\nThe Tesla is accelerating...");
        } else {
            System.out.println("\nThe Tesla is decelerating...");
        }

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 40) {
            changeGear(3);
        } else if (newVelocity > 40 && newVelocity <= 60) {
            changeGear(4);
        } else if (newVelocity > 60 && newVelocity <= 90) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("\nThe Tesla stopped.");
    }
}
