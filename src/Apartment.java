import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Apartment {
    public static void main(String[] args) {
        String[] antiHeroes = {"Jocker", "Grinch", "Ikrom zladey", "Shurik"};
        List<String> list1 = new ArrayList<String>();

        for (String x:antiHeroes)
            list1.add(x);
        String[] moreAntiHeroes = {"Ikrom shurik","Jocker"};
            List<String> list2 = new ArrayList<String>();
        for (String x:moreAntiHeroes)
            list2.add(x);
        for (String x:moreAntiHeroes)
            list1.add(x);

        for (int i = 0; i <list2.size(); i++) {
            System.out.printf("Список 2 - %s \n",list2.get(i));
        }
        for (int i = 0; i <list1.size(); i++) {
            System.out.printf("Список 1 - %s \n",list1.get(i));
        }
    }

}