public class People {


    public static void main(String[] args) {
        Person vitya = new Person(120,"vitya");
        vitya.say("George");
        System.out.println(vitya.name +"\'s height is " + vitya.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshman = new Student(76,"Viktor",2);
       freshman.tell();
        Student fresh = new Student(200,"Vasiya",3);
        fresh.tell();


    }

}
