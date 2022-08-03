public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla(48);
        System.out.println("Road service months are: " +
                tesla.getRoadServiceMonths());

        tesla.steer(30);
        tesla.accelerate(50);

        tesla.steer(45);
        tesla.accelerate(45);

        tesla.steer(-75);
        tesla.accelerate(-70);

        tesla.accelerate(-25);
    }
}
