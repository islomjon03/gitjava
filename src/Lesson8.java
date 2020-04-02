import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lesson8 {
    public static void main(String[] args) {
        String[] PulpFiction = {"Мина","Джон","Винсон","Мареселас", "Вутч"};
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(PulpFiction));

        list.add("Кунщ");
        list.addFirst("Винстон");

        PulpFiction = list.toArray(new String[list.size()]);
        for (String x : PulpFiction)
            System.out.println(x);
    }
}
