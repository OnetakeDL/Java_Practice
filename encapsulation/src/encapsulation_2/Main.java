package encapsulation_2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = "
                + printer.getPagesPrinted());

        int pagePrinted = printer.printPages(4);
        System.out.println(pagePrinted + " pages were printed");
        System.out.println("New total print count is now: "
                + printer.getPagesPrinted() + "\n");

        pagePrinted = printer.printPages(5);
        System.out.println(pagePrinted + " pages was printed");
        System.out.println("New total print count is now: "
                + printer.getPagesPrinted());
    }
}
