package PC;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 10);
        Case theCase = new Case("220B", "Dell",
                "240", dimensions);

        //在参数中写new Resolution(2540, 1440),在没有使用变量的情况下,创建Resolution的实例
        //the new Resolution(2540, 1440) as a parameter means
        //creating a Resolution instance without using any variable
        Monitor theMonitor = new Monitor("27inch Beast",
                "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200",
                "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
        thePC.getMotherboard().loadProgram("Windows 10");
    }
}
