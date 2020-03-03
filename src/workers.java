import org.w3c.dom.ls.LSOutput;

import java.awt.event.WindowFocusListener;

public class workers {
    static String [] names = new String[5];
    static String [] jobs = new String[5];

    public static void main(String[] args) {
        newWorker("avaz","teacher");
        newWorker("Andrey","doctor");
        newWorker("Aziz","razrabotchik");
        newWorker("Sardor","stamotolog");
        newWorker("Anton","trener");
        removeWorker("Aziz","razrabotchik");

        getList();

    }

    static void newWorker(String name, String job){
        int index = 0;
        boolean isFree = false;
        for (int i = 0; i <names.length ; i++) {
            if (names[i] == null){
             index = i;
             isFree = true;
             break;
            }else {
                isFree = false;
            }
        }
        if (isFree){
                names[index] = name;
                jobs[index] = job;
            System.out.println("работник "+name+" был успешна нанят");
        }else{
            System.out.println("нету свободных для рфботника"+name);
        }
    }
    static void removeWorker(String name, String job){
        int index = 0;
        boolean isFound = false;
        for (int i = 0; i <names.length ; i++) {
            if (name.equals(names[i])){
                index = i;
                isFound = true;
                break;
            }

        }
        if (isFound){
            names[index] = null;
            jobs[index] = null;
            System.out.println("рфботик "+name+" уволен");
        }else {
            System.out.println("не удфлос найти рфботника "+name+" в списке рфботников");
        }
    }

    static void getList(){
        System.out.println("Список рфботников");
        for (int i = 0; i <names.length ; i++) {

            System.out.println((i+1)+" . "+names[i]+" "+jobs[i]);
        }
    }

}