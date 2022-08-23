import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Members DL = new Members("DL", "DownBlock", 22, "Guilin", "Software Engineering", false);
        Members Fahrn = new Members("Fahrn", "Jiangbei", 21, "Dongguan", "Logistics Engineering", true);
        Members Fiona = new Members("Fiona", "Dongping", 20, "Nantong", "Educational Technology(Normal)", true);
        Members Claire = new Members("Claire", "Boluo", 20, "Guangzhou", "International Economics and Trade", true);
        Members Villmina = new Members("Villmina", "Xiaojinkou", 20, "Chengdu", "Business English", false);
        Members Stone = new Members("Stone", "Jinshan Lake", 22, "Guangzhou", "Business English", false);


        ArrayList<Members> list = new ArrayList<>();
        list.add(DL);
        list.add(Fiona);
        list.add(Fahrn);
        list.add(Villmina);
        list.add(Claire);
        list.add(Stone);

        ArrayList<Members> randomOrder = createRandomOrder(list);
        printRandomOrder(randomOrder);

        //DL.introduce();
        //Fahrn.introduce();
        //Fiona.introduce();
        //Claire.introduce();
        //Villmina.introduce();
        //Stone.introduce();
    }

    public static ArrayList<Members> createRandomOrder(ArrayList<Members> list) {
        Random r = new Random();
        ArrayList<Members> randomList = new ArrayList<>();

        for (int i = 0; i < list.size(); ) {
            int randomNumber = r.nextInt(list.size());
            Members randomMember = list.get(randomNumber);
            boolean flag = ifContains(randomList, randomMember);
            if (!flag) {
                randomList.add(randomMember);
                i++;
            }
        }
        return randomList;
    }

    public static void printRandomOrder(ArrayList<Members> randomList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPress \"Enter\" to display the result (^_^)");
        sc.nextLine();
        System.out.println("\nThe random order is: ");
        for (int i = 0; i < randomList.size(); i++) {
            System.out.println(randomList.get(i).getName());
        }
    }

    public static boolean ifContains(ArrayList<Members> list, Members member) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == member) {
                return true;
            }
        }
        return false;
    }
}
