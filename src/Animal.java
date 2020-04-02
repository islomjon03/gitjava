import java.util.*;
public class Animal{
    public static void main(String[] args) {
        String[] zveri1 = {"кот ","волк ","пингвин ","еЖиК ","дракон "};
        List<String> list1 = new LinkedList<String>();
        for (String x: zveri1)
            list1.add(x);
        String[] zveri2 ={" удаф ","волк "," ЕжиК "};
        List<String> list2 = new LinkedList<String>();
        for (String x: zveri2)
            list2.add(x);
        list1.addAll(list2);
        list2 = null;

        printlist(list1);
        removeFromList(list1, 1, 3);
        printlist(list1);
        reversList(list1);

    }
    private static void printlist(List<String> lst){
        for (String a : lst) {
            System.out.printf("%s", a);
        }
        System.out.println();
    }
    private static void removeFromList(List<String> lst, int start , int end){
        lst.subList(start, end ).clear();
    }
    private static void reversList(List<String> lst){
        ListIterator<String> iterator = lst.listIterator(lst.size());
        while (iterator.hasPrevious())
            System.out.printf("%s", iterator.previous());
    }

}
