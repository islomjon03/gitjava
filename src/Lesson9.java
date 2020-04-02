import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.*;
public class Lesson9 {
    public static void main(String[] args) {
        Integer[] numbers = {33,77,44,5,88,22,66};
        List<Integer> list = Arrays.asList(numbers);

        Collections.sort(list);
        System.out.printf("%s\n", list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("%s\n", list);
    }
}