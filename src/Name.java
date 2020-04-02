public class Name {
    public static void main(String[] args) {
        String[] a = {"Икром","Ислом","Акром","Сардор","Анвар"};
        for (String s : a)
            System.out.println(s);
        for (String s : a)
            if (s.startsWith("И"))
            System.out.println(s + " Начинаушийся буква");
        for (String s : a)
            if (s.endsWith("ом"))
                System.out.println(s + " ends words ");
    }
}
